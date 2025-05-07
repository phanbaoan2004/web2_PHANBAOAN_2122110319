import React, { useEffect, useState } from 'react';
import { BlobProvider } from '@react-pdf/renderer';
import MyDocument from './MyDocument';
import { HiOutlinePrinter } from 'react-icons/hi';

const PDFButton = () => {
    const [data, setData] = useState(null);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState<Error | null>(null); // Thêm kiểu cho error

    useEffect(() => {
        const fetchData = async () => {
            const cartId = localStorage.getItem("cartId");
            const token = localStorage.getItem('jwt-token');
            const email = localStorage.getItem('username');


            if (!cartId) {
                setError(new Error('No cart ID found in localStorage'));
                setLoading(false);
                return;
            }
            if (!token) {
                setError(new Error('No token found in localStorage'));
                setLoading(false);
                return;
            }

            try {
                const response = await fetch(`http://localhost:8080/api/public/users/${encodeURIComponent(email)}/carts/${cartId}`, {
                    headers: {
                        'Authorization': `Bearer ${token}`,
                        'Content-Type': 'application/json',
                    },
                });

                if (!response.ok) {
                    throw new Error('Network response was not ok');
                }

                const result = await response.json();
                setData(result);
            } catch (error) {
                setError(error instanceof Error ? error : new Error('An unknown error occurred'));
            } finally {
                setLoading(false);
            }
        };

        fetchData();
    }, []);

    if (loading) return <div>Loading...</div>;
    if (error) return <div>Error: {error.message || 'An error occurred'}</div>;

    const styles = {
        btn: {
            borderRadius: '3px',
            display: 'flex',
            alignItems: 'center',
            gap: '4px',
            padding: '6px 10px',
            fontSize: '12px',
            color: '#ffd700',
            fontWeight: 700,
            cursor: 'pointer',
            userSelect: 'none',
            backgroundColor: '#ffd70000',
            textDecoration: 'none',
            transition: 'background-color 0.3s, color 0.3s',
        },
    };

    return (
        <BlobProvider document={<MyDocument data={data} />}>
            {({ url, blob }) => (
                <a
                    href={url}
                    target="_blank"
                    rel="noopener noreferrer"
                    style={styles.btn}
                >
                    <HiOutlinePrinter size={17} />
                    <span style={{ textDecoration: 'none' }}>PRINT</span>
                </a>
            )}
        </BlobProvider>
    );
};

export default PDFButton;
