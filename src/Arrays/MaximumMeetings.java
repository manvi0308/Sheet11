public class MaximumMeetings {
    public static List<Integer> maximumMeetings(int[] start, int[] end) {
        // Write your code here
        int n = start.length;
        List<meet> meetings = new ArrayList<>();
        // Adding all the values in one object meetings
        for (int i = 0; i < n; i++) {
            meet temp = new meet(0);
            temp.id = i + 1;
            temp.sTime = start[i];
            temp.eTime = end[i];
            meetings.add(temp);
        }

        // Sort all the meetings by their eTime
        meetings.sort(new Comparator<meet>() {
            @Override
            public int compare(meet m1, meet m2) {
                if (m1.eTime == m2.eTime) {
                    return m1.id - m2.id;
                }

                return m1.eTime - m2.eTime;
            }

        });

        List<Integer> result = new ArrayList<>();
        result.add(meetings.get(0).id);
        int currentTime = meetings.get(0).eTime;
        for (int i = 1; i < n; i++) {
            if (meetings.get(i).sTime > currentTime) {
                result.add(meetings.get(i).id);
                currentTime = meetings.get(i).eTime;
            }
        }

        return result;
    }
}
