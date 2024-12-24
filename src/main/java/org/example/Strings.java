package org.example;

import java.util.ArrayList;
import java.util.List;

public class Strings {
    private List<String> list = new ArrayList<>();

    public void add(String var){
        int lenth = var.length();
        if (lenth > 0){
            boolean acc = true;
            for (int i = 0; i < list.size(); i++){
                if (lenth < list.get(i).length()){
                    list.add(i, var);
                    acc = false;
                    break;
                }
            }
            if (acc) {
                list.add(var);
            }
        }else{
            list.add(var);
        }
    }

    public String max(){
        return list.get(list.size()-1);
    }

    public float avg(){
        float s = 0;
        int len = list.size();
        for (int i = 0; i < len; i++){
            s += list.get(i).length();
        }
        return s/len;
    }


}
