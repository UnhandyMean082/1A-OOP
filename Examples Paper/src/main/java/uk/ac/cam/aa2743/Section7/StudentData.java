package uk.ac.cam.aa2743.Section7;

import java.util.*;

public class StudentData {
    private Map<String, Double> data;

    public StudentData() {
        data = new HashMap<>();
    }

    public void addStudent(String name, Double mark) {
        data.put(name, mark);
    }

    public List<String> getStudents() {
        List<String> names = new ArrayList<>(data.keySet());
        Collections.sort(names);
        return names;
    }

    public List<String> getTopP(double p) {
        List<Map.Entry<String, Double>> entries = new ArrayList<>(data.entrySet());
        entries.sort(new Comparator<Map.Entry<String, Double>>() {
            @Override
            public int compare(Map.Entry<String, Double> e1, Map.Entry<String, Double> e2) {
                return Double.compare(e2.getValue(), e1.getValue());
            }
        });

        int n = (int) Math.ceil(entries.size() * (p / 100.0));

        List<String> top = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i < entries.size()) {
                top.add(entries.get(i).getKey());
            }
        }
        return top;
    }

    public double getMedianMark() {
        if (data.isEmpty()) {
            return 0.0;
        }
        List<Double> marks = new ArrayList<>(data.values());
        Collections.sort(marks);
        int size = marks.size();
        if (size % 2 == 1) {
            return marks.get(size / 2);
        } else {
            double middle1 = marks.get((size / 2) - 1);
            double middle2 = marks.get(size / 2);
            return (middle1 + middle2) / 2.0;
        }
    }
}
