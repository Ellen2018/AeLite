package com.ellen.aelite;

import com.ellen.annotation.AeLiteField;
import com.ellen.annotation.AeLiteTable;

@AeLiteTable
public class Student {
    @AeLiteField(isPrimaryKey = true)
    private int id;
}
