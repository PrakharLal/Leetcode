// Title: Simplify Path
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/simplify-path/

                    stack.pop();
                }
            } 
            else {
                stack.push(part);
            }
        }

        // Build result
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }

        return result.length() == 0 ? "/" : result.toString();
    }
}
