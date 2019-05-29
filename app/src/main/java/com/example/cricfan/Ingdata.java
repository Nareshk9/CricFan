package com.example.cricfan;

public class Ingdata {
    public String toss;
    public String score;
    public Number wicket_taken;
    public Number total_6s;
    public Number total_4s;
    public Number extras;
    public Number op;
    public Number h_scorer;
    public Number h_Wickets;
    public Number total_catches;
    public Number result;

    public Ingdata()
    {

    }

    public Ingdata(String toss, String score, Number wicket_taken, Number total_6s, Number total_4s, Number extras, Number op, Number h_scorer, Number h_Wickets, Number total_catches, Number result) {
        this.toss = toss;
        this.score = score;
        this.wicket_taken = wicket_taken;
        this.total_6s = total_6s;
        this.total_4s = total_4s;
        this.extras = extras;
        this.op = op;
        this.h_scorer = h_scorer;
        this.h_Wickets = h_Wickets;
        this.total_catches = total_catches;
        this.result = result;
    }
}
