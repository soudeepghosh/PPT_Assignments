package ppt.assignment3;
//    Leetcode #252. Meeting Rooms
public class Q8_MeetingRooms {
    public static boolean canAttend(int[][] intervals){
		if(intervals == null || intervals.length == 0) return true;
		for(int i = 1; i < intervals.length; i++){
			if(intervals[i][0] < intervals[i - 1][1])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
        // Example 1:
        // Input: intervals = [[0,30],[5,10],[15,20]]
        // Output: false
		int[][] t = {{0, 30}, {5, 10}, {15, 20}};
		System.out.println(canAttend(t));
	}
}
