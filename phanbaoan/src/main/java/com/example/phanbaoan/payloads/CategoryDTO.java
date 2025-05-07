package com.example.phanbaoan.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.util.ArrayList;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {

private Long categoryId;
private String categoryName;
private List<ProductDTO> products = new ArrayList<>();
}