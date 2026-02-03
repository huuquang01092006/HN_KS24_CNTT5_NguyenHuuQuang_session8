public class Student {
    private String id;
    private String name;
    private Double score;

    public Student() {
    }

    public Student(String id, String name, Double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getRank() {
        if (score >= 8) {
            return "Gioi";
        }else if (6.5 <= score && score < 8) {
            return "Kha";
        }else {
            return "Trung Binh";
        }
    }

    @Override
    public String toString() {
        return "Student{" + "id: " + id + ", Tên: " + name + ", Điểm: " + score + ", Học lực: " + getRank() + '}';
    }
}
