package com.destiny.scootves.Model;

import java.util.ArrayList;

public class SejarahData {
    public static String[][] data = new String[][]{
            {"Gambar Scooter",
                    "Sejarah Scooter"
            },
            {"Gambar Vespa",
                    "Sejarah Vespa"
            }
    };
    public static ArrayList<Model> getListData(){
        Model model = null;
        ArrayList<Model> list = new ArrayList<>();
        for (String[] aData : data) {
            model = new Model();
            model.setSejarahGambar(aData[0]);
            model.setSejarahDetail(aData[1]);
            list.add(model);
        }

        return list;
    }
}
