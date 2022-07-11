import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    class Interval {
        int start;
        int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    // ToDo: Ask if the intervals are sorted or not
    // & Sort the intervals by their start time, Comparator interface is used
    // & The first interval will always be added
    // & From second interval onwards, check if they overlap with the existin
    // interval
    // & If overlap, then update the end time by max of end time of the two
    // intervals
    // & If no overlap, then add it as a separate interval

    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        Arrays.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval a, Interval b) {
                if (a.start == b.start) {
                    return a.finish - b.finish;
                }

                return a.start - b.start;
            }
        });
        List<Interval> res = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int currentStart = intervals[i].start;
            int currentEnd = intervals[i].finish;
            // ! If the current start is greater than the end timing of the previous
            // interval
            // ! currentStart > res.get(res.size() - 1).finish)
            if (res.size() == 0 || currentStart > res.get(res.size() - 1).finish) {
                res.add(intervals[i]);
            }

            else {
                // ! Update the end time to the max time of two
                res.get(res.size() - 1).finish = Math.max(res.get(res.size() - 1).finish, currentEnd);
            }
        }

        return res;

    }

    public static void main(String[] args) {
        List<Interval> intervals = new List<E>();
        intervals.add(0, new Interval(1, 4));
        intervals.add(0, new Interval(3, 5));
        intervals.add(0, new Interval(6, 8));
        intervals.add(0, new Interval(10, 12));
        intervals.add(0, new Interval(8, 9));

    }
}
