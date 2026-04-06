// Title: Walking Robot Simulation
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/walking-robot-simulation/

            else {
                // move step by step
                for (int i = 0; i < cmd; i++) {
                    int nx = x + dir[d][0];
                    int ny = y + dir[d][1];

                    if (set.contains(nx + "," + ny)) {
                        break; // obstacle hit
                    }

                    x = nx;
                    y = ny;

                    maxDist = Math.max(maxDist, x*x + y*y);
                }
            }
        }

        return maxDist;
    }
}
