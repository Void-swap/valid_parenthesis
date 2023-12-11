# valid_parenthesis
## About Problem
Given a string containing only the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.<br>
An input string is valid if it meets the following criteria:<br>
Open brackets must be closed by the same type of brackets.<br>
Open brackets must be closed in the correct order.<br>

## Solution 
Initialize an empty stack to store opening brackets.<br>
Iterate through each character in the string from left to right.<br>
For each character:<br>
If it's an opening bracket, push it onto the stack.<br>
If it's a closing bracket:<br>
Check if the stack is empty. If it is, return false.<br>
Pop the top element from the stack.<br>
Check if the popped opening bracket matches the current closing bracket. If not, return false.<br>
After processing all characters, check if there are any remaining elements in the stack. If there are, return false (unmatched opening brackets).<br>
If the stack is empty at the end, return true (valid parentheses).<br>
This algorithm efficiently checks if the input string contains valid and properly balanced parentheses,<br> with a time complexity of O(n), where n is the length of the input string.
