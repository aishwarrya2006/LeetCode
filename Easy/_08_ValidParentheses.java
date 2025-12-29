import java.util.*;
class Solution {
    public boolean isValid(String s) 
    {
            Deque<Character> stack = new ArrayDeque<>();
            boolean flag = true;
            if(s.length() <=1)
            {
                flag = false;
                return flag;
            }
            for(int i = 0; i<s.length(); i++)
            {
                switch(s.charAt(i))
                {
                    case '(':
                    case '{':
                    case '[':
                        stack.push(s.charAt(i));
                        break;

                    case ')':
                        if(stack.isEmpty())
                            {
                                flag = false;
                                return flag;
                            }
                    
                        if(stack.peek() == '(')
                        {
                            int del = stack.pop();
                            break;
                        }
                        else
                        {
                            flag = false;
                            return flag;
                        }

                    case '}':
                        if(stack.isEmpty())
                            {
                                flag = false;
                                return flag;
                            }
                    
                        if(stack.peek() == '{')
                        {
                            int del = stack.pop();
                            break;
                        }
                        else
                        {
                            flag = false;
                            return flag;
                        }
                    case ']':
                        if(stack.isEmpty())
                            {
                                flag = false;
                                return flag;
                            }
                     
                        if(stack.peek() == '[')
                        {
                            int del = stack.pop();
                            break;
                        }
                        else
                        {
                            flag = false;
                            return flag;
                        }     
                }
            }
            if(!stack.isEmpty())
            {
                flag = false;
            }
            return flag;
    }
}