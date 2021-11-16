package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class program1 extends AppCompatActivity {

    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program1);

        init();

        getData();
    }

    private void init() {
        RecyclerView recyclerView = findViewById(R.id.recylclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        adapter = new RecyclerAdapter();
        recyclerView.setAdapter(adapter);
    }

    private void getData() {
        // 임의의 데이터입니다.
        List<String> listWriter = Arrays.asList("가정", "가정", "한마음 아동센터");
        List<String> listText = Arrays.asList(
                "오늘은 'ㅏ'발음 연습을 해봤어요. 가르쳐주신 노래를 열심히 따라부르니 전보다 많이 나아졌어요. 심지어 'ㅐ'발음도 따라하더라구요. 요즘 점점 나아지고 있는 모습을 보니 정말 다행이에요.",
                "오늘은 뽀로로 영상을 같이 보면서 노래를 따라불렀어요. 아직 처음이라 발음이 많이 어색하지만 더 열심히 연습하려구요.",
                "뽀로로 영상을 계속 봤더니 좀 따라하는 것 같아요. 다행히 아이도 좋아하는 것 같아 계속 연습하고 있어요"
        );
        List<Integer> listImage = Arrays.asList(
                R.drawable.program1_image,
                R.drawable.program1_image2,
                R.drawable.program1_image3
        );
        for (int i = 0; i < listWriter.size(); i++) {
            // 각 List의 값들을 data 객체에 set 해줍니다.
            Data data = new Data();
            data.setProgram1_writer(listWriter.get(i));
            data.setProgram1_text(listText.get(i));
            data.setProgram1_image(listImage.get(i));

            // 각 값이 들어간 data를 adapter에 추가합니다.
            adapter.addItem(data);
        }

        // adapter의 값이 변경되었다는 것을 알려줍니다.
        adapter.notifyDataSetChanged();
    }
}