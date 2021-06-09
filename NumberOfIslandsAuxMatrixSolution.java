class Solution {
	public int numIslands(char[][] grid) {
		int count = 0;
        boolean[][] auMat = new boolean[grid.length][grid[0].length];
		for (int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
				if(grid[i][j] == '1' && auMat[i][j] == false) {
					count += 1;
					callDFS(grid, auMat, i, j);
				}
			}
		}
		return count;
	}
	
	public void callDFS(char[][] grid, boolean auMat[][], int i, int j) {
		if(i < 0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j] == '0') {
            return;
        }
        if (auMat[i][j] == true) {
            return;
        }
        
        auMat[i][j] = true;
        callDFS(grid, auMat, i+1, j); // down
        callDFS(grid, auMat, i-1, j); // up
        callDFS(grid, auMat, i, j+1); // right
        callDFS(grid, auMat, i, j-1); // left             
    }
		
}
