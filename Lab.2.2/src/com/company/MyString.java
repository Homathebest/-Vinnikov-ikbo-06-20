package com.company;

import java.util.Arrays;

public final class MyString{
    final char[] string;
    public MyString(){
        this.string = null;
    }
    public MyString(char value[]){
        this.string = value;
    }
    public MyString(MyString original){
        this.string = original.string;
    }
    public MyString(String original){
        string = original.toCharArray();
    }
    @Override
    public String toString(){
        return Arrays.toString(string);
    }
    public MyString concat(MyString s1, MyString s2){
        char [] result = new char[s1.string.length + s2.string.length];
        for (int i = 0; i<s1.string.length; i++){
            result [i] = s1.string[i];
        }
        for (int i = s1.string.length; i<result.length; i++){
            result [i] = s2.string[i-s1.string.length];
        }
        MyString s3 = new MyString(result);
        return s3;
    }
    public char charAt(int i){
        return string[i];
    }
    public int length(){
        return string.length;
    }
    public boolean equals(MyString s1, MyString s2){
        if (s1.string.length != s2.string.length){
            return false;
        }
        else{
            for (int i = 0; i < s1.string.length; i++){
                if (s1.string[i] != s2.string[i]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isEmpty(){
        for (int i = 0; i<string.length; i++){
            if (string[i] != '\0') {
                return false;
            }
            break;
        }
        return true;
    }
    public MyString substring(int beginIndex, int endIndex){
        char [] result = new char[endIndex - beginIndex + 1];
        int j = 0;
        for (int i=beginIndex; i<= endIndex; i++){
            result[j] = this.string[i];
            ++j;
        }
        MyString s = new MyString(result);
        return s;
    }
    public int compareTo(MyString anotherString) {
        char[] v1 = string;
        char[] v2 = anotherString.string;
        int i = 0;
        while (v1[i] == v2[i]) {
            i++;
            if (i >= v1.length || i >= v2.length) {
                i=i-1;
                break;
            }
        }
        if (v1.length - v2.length != 0) {
            return v1.length - v2.length;
        }
        return Character.compare(v1[i], v2[i]);
    }
    public MyString trim() {
        StringBuilder str = new StringBuilder();
        for (char c : string) {
            if (c != ' ') {
                str.append(c);
            }
        }
        return new MyString(str.toString());
    }
}