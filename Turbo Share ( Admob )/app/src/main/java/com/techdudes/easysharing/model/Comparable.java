package com.techdudes.easysharing.model;

public interface Comparable
{
    boolean comparisonSupported();

    String getComparableName();

    long getComparableDate();

    long getComparableSize();
}
