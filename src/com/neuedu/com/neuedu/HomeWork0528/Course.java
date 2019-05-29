package com.neuedu.com.neuedu.HomeWork0528;

public class Course {
    private String cname;
    private float score;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                ", score=" + score +
                '}';
    }
}
