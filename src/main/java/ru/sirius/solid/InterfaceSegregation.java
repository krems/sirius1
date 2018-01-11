package ru.sirius.solid;

import java.io.Serializable;

public class InterfaceSegregation implements Serializable, Comparable<InterfaceSegregation>, CharSequence {
    private final char[] value;
    
    public InterfaceSegregation(final char[] value) {
        this.value = value;
    }
    
    @Override
    public char charAt(final int index) {
        if (index < 0 || index >= value.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return value[index];
    }
    
    @Override
    public CharSequence subSequence(final int start, final int end) {
        if (start < 0 || start >= value.length || end < 0 || end >= value.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (start > end) {
            throw new IllegalArgumentException();
        }
        char[] tmp = new char[end - start + 1];
        System.arraycopy(value, start, tmp, 0, tmp.length);
        return new InterfaceSegregation(tmp);
    }
    
    @Override
    public int compareTo(final InterfaceSegregation o) {
        return Integer.compare(length(), o.length());
    }
    
    @Override
    public int length() {
        return value.length;
    }
}
