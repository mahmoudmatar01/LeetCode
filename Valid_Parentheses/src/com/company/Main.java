package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {


//        Example 1:
//
//        Input: s = "()"
//        Output: true
//        Example 2:
//
//        Input: s = "()[]{}"
//        Output: true
//        Example 3:
//
//        Input: s = "(]"
//        Output: false

    }


    public boolean isValid(String s) {

        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else{
                Character top=stack.isEmpty()?'#':stack.pop();
                if(s.charAt(i)==')'&&top!='(') return false;
                if(s.charAt(i)=='}'&&top!='{') return false;
                if(s.charAt(i)==']'&&top!='[') return false;
            }
        }

        return stack.isEmpty();
    }

}
