class Solution {
    public boolean isValid(String s) {
       
        Stack<Character> characterStack = new Stack<>();

        for (char ch: s.toCharArray()) {

            if (ch == '{' || ch == '(' || ch == '[') {
                characterStack.push(ch);
            } else {
                if (ch == '}') if (characterStack.isEmpty() || characterStack.pop() != '{') return false;
                if (ch == ')') if (characterStack.isEmpty() || characterStack.pop() != '(') return false;
                if (ch == ']') if (characterStack.isEmpty() || characterStack.pop() != '[') return false;
            }
        }

        return characterStack.isEmpty();
    }
}