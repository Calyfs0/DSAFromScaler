package leetcode;

public class ContainerWithMoreWater {
    public int maxArea(int[] height) {

        int area = 0;
        int i = 0;
        int j = height.length - 1;

        while (i != j) {
            int current_area = (j - i) * Math.min(height[i], height[j]);

            if (current_area > area) {
                area = current_area;
            }

            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }

        return area;
    }
}
