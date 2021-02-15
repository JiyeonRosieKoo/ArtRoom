package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button first_palette;
    Button second_palette;

    ImageView first;
    ImageView second;
    ImageView third;
    ImageView forth;
    ImageView fifth;
    ImageView sixth;
    ImageView seventh;
    ImageView eighth;
    ImageView ninth;

    Button db1;
    Button db2;
    Button db3;
    Button db4;
    Button db5;
    Button db6;
    Button db7;
    Button db8;
    Button db9;
    Button db10;
    Button db11;
    Button db12;

    Button reset;
    Button cancel;
    Button apply;
    Button alter;

    Button[] mButton = new Button[15];
    ArrayList<String> mDataList;


    int click1 = 0;
    int click2 = 0;
    int click3 = 0;
    int click4 = 0;
    int click5 = 0;
    int click6 = 0;
    int click7 = 0;
    int click8 = 0;
    int click9 = 0;


    int drawableId1 = 0;
    int drawableId2 = 0;
    int drawableId3 = 0;
    int drawableId4 = 0;
    int drawableId5 = 0;
    int drawableId6 = 0;
    int drawableId7 = 0;
    int drawableId8 = 0;
    int drawableId9 = 0;

    int palette_state = 0;

    TableLayout tableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        palette_state = 1; // 페이지 들어오자 마자 팔레트는 첫번째에 FOCUS

        first_palette = (Button) findViewById(R.id.first_palette);
        second_palette = (Button) findViewById(R.id.alter);

        //Palette
        first = (ImageView) findViewById(R.id.first);
        second = (ImageView) findViewById(R.id.second);
        third = (ImageView) findViewById(R.id.third);
        forth = (ImageView) findViewById(R.id.forth);
        fifth = (ImageView) findViewById(R.id.fifth);
        sixth = (ImageView) findViewById(R.id.sixth);
        seventh = (ImageView) findViewById(R.id.seventh);
        eighth = (ImageView) findViewById(R.id.eighth);
        ninth = (ImageView) findViewById(R.id.ninth);

        //Image_Library
        db1 = (Button) findViewById(R.id.db1);
        db2 = (Button) findViewById(R.id.db2);
        db3 = (Button) findViewById(R.id.db3);
        db4 = (Button) findViewById(R.id.db4);
        db5 = (Button) findViewById(R.id.db5);
        db6 = (Button) findViewById(R.id.db6);
        db7 = (Button) findViewById(R.id.db7);
        db8 = (Button) findViewById(R.id.db8);
        db9 = (Button) findViewById(R.id.db9);
        db10 = (Button) findViewById(R.id.db10);
        db11 = (Button) findViewById(R.id.db11);
        db12 = (Button) findViewById(R.id.db12);


        reset = (Button) findViewById(R.id.reset);
        cancel = (Button) findViewById(R.id.cancel);
        apply = (Button) findViewById(R.id.apply);
        alter = (Button) findViewById(R.id.alter);


        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click1 = 1;
                System.out.println("#########1칸을 선택함");
                db1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click1 = 0;
                        System.out.println("####DB.1그림을 선택함");
                        first.setImageResource(R.drawable.art1);
                        first.setTag(R.id.first, R.drawable.art1);
                        drawableId1 = (Integer) first.getTag(R.id.first);
                    }
                });
                db2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click1 = 0;
                        System.out.println("####DB.2그림을 선택함");
                        first.setImageResource(R.drawable.art2);
                        first.setTag(R.id.first, R.drawable.art2);
                        drawableId1 = (Integer) first.getTag(R.id.first);
                    }
                });
                db3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click1 = 0;
                        System.out.println("####DB.3그림을 선택함");
                        first.setImageResource(R.drawable.art3);
                        first.setTag(R.id.first, R.drawable.art3);
                        drawableId1 = (Integer) first.getTag(R.id.first);
                    }
                });
                db4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click1 = 0;
                        System.out.println("####DB.4그림을 선택함");
                        first.setImageResource(R.drawable.art4);
                        first.setTag(R.id.first, R.drawable.art4);
                        drawableId1 = (Integer) first.getTag(R.id.first);
                    }
                });
                db5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click1 = 0;
                        System.out.println("####DB.5그림을 선택함");
                        first.setImageResource(R.drawable.art5);
                        first.setTag(R.id.first, R.drawable.art5);
                        drawableId1 = (Integer) first.getTag(R.id.first);
                    }
                });
                db6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click1 = 0;
                        System.out.println("####DB.6그림을 선택함");
                        first.setImageResource(R.drawable.art6);
                        first.setTag(R.id.first, R.drawable.art6);
                        drawableId1 = (Integer) first.getTag(R.id.first);
                    }
                });
                db7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click1 = 0;
                        System.out.println("####DB.7그림을 선택함");
                        first.setImageResource(R.drawable.art7);
                        first.setTag(R.id.first, R.drawable.art7);
                        drawableId1 = (Integer) first.getTag(R.id.first);
                    }
                });
                db8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click1 = 0;
                        System.out.println("####DB.8그림을 선택함");
                        first.setImageResource(R.drawable.art8);
                        first.setTag(R.id.first, R.drawable.art8);
                        drawableId1 = (Integer) first.getTag(R.id.first);
                    }
                });
                db9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click1 = 0;
                        System.out.println("####DB.9그림을 선택함");
                        first.setImageResource(R.drawable.art9);
                        first.setTag(R.id.first, R.drawable.art9);
                        drawableId1 = (Integer) first.getTag(R.id.first);
                    }
                });
                db10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click1 = 0;
                        System.out.println("####DB.10그림을 선택함");
                        first.setImageResource(R.drawable.art1);
                        first.setTag(R.id.first, R.drawable.art1);
                        drawableId1 = (Integer) first.getTag(R.id.first);
                    }
                });
                db11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click1 = 0;
                        System.out.println("####DB.11그림을 선택함");
                        first.setImageResource(R.drawable.art2);
                        first.setTag(R.id.first, R.drawable.art2);
                        drawableId1 = (Integer) first.getTag(R.id.first);
                    }
                });
                db12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click1 = 0;
                        System.out.println("####DB.12그림을 선택함");
                        first.setImageResource(R.drawable.art3);
                        first.setTag(R.id.first, R.drawable.art3);
                        drawableId1 = (Integer) first.getTag(R.id.first);
                    }
                });
            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click2 = 1;
                System.out.println("#########2번칸을 선택함");
                db1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click2 = 0;
                        System.out.println("#######DB.1 그림을 선택함");
                        second.setImageResource(R.drawable.art1);
                        second.setTag(R.id.second, R.drawable.art1);
                        drawableId2 = (Integer) second.getTag(R.id.second);
                    }
                });
                db2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click2 = 0;
                        System.out.println("#######DB.2번 그림을 선택함");
                        second.setImageResource(R.drawable.art2);
                        second.setTag(R.id.second, R.drawable.art2);
                        drawableId2 = (Integer) second.getTag(R.id.second);
                    }
                });
                db3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click2 = 0;
                        System.out.println("#######DB.3번 그림을 선택함");
                        second.setImageResource(R.drawable.art3);
                        second.setTag(R.id.second, R.drawable.art3);
                        drawableId2 = (Integer) second.getTag(R.id.second);
                    }
                });
                db4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click2 = 0;
                        System.out.println("#######DB.4번 그림을 선택함");
                        second.setImageResource(R.drawable.art4);
                        second.setTag(R.id.second, R.drawable.art4);
                        drawableId2 = (Integer) second.getTag(R.id.second);
                    }
                });
                db5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click2 = 0;
                        System.out.println("#######DB.5번 그림을 선택함");
                        second.setImageResource(R.drawable.art5);
                        second.setTag(R.id.second, R.drawable.art5);
                        drawableId2 = (Integer) second.getTag(R.id.second);
                    }
                });
                db6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click2 = 0;
                        System.out.println("#######DB.6번 그림을 선택함");
                        second.setImageResource(R.drawable.art6);
                        second.setTag(R.id.second, R.drawable.art6);
                        drawableId2 = (Integer) second.getTag(R.id.second);
                    }
                });
                db7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click2 = 0;
                        System.out.println("#######DB.7번 그림을 선택함");
                        second.setImageResource(R.drawable.art7);
                        second.setTag(R.id.second, R.drawable.art7);
                        drawableId2 = (Integer) second.getTag(R.id.second);
                    }
                });
                db8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click2 = 0;
                        System.out.println("#######DB.8번 그림을 선택함");
                        second.setImageResource(R.drawable.art8);
                        second.setTag(R.id.second, R.drawable.art8);
                        drawableId2 = (Integer) second.getTag(R.id.second);
                    }
                });
                db9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click2 = 0;
                        System.out.println("#######DB.9번 그림을 선택함");
                        second.setImageResource(R.drawable.art9);
                        second.setTag(R.id.second, R.drawable.art9);
                        drawableId2 = (Integer) second.getTag(R.id.second);
                    }
                });
                db10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click2 = 0;
                        System.out.println("#######DB.10번 그림을 선택함");
                        second.setImageResource(R.drawable.art1);
                        second.setTag(R.id.second, R.drawable.art1);
                        drawableId2 = (Integer) second.getTag(R.id.second);
                    }
                });
                db11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click2 = 0;
                        System.out.println("#######DB.11번 그림을 선택함");
                        second.setImageResource(R.drawable.art2);
                        second.setTag(R.id.second, R.drawable.art2);
                        drawableId2 = (Integer) second.getTag(R.id.second);
                    }
                });
                db12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click2 = 0;
                        System.out.println("#######DB.12번 그림을 선택함");
                        second.setImageResource(R.drawable.art3);
                        second.setTag(R.id.second, R.drawable.art3);
                        drawableId2 = (Integer) second.getTag(R.id.second);
                    }
                });
            }
        });

        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click3 = 1;
                System.out.println("#########3번칸을 선택함");
                db1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click3 = 0;
                        System.out.println("#######DB.1 그림을 선택함");
                        third.setImageResource(R.drawable.art1);
                        third.setTag(R.id.third, R.drawable.art1);
                        drawableId3 = (Integer) third.getTag(R.id.third);
                    }
                });
                db2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click3 = 0;
                        System.out.println("#######DB.2 그림을 선택함");
                        third.setImageResource(R.drawable.art2);
                        third.setTag(R.id.third, R.drawable.art2);
                        drawableId3 = (Integer) third.getTag(R.id.third);
                    }
                });
                db3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click3 = 0;
                        System.out.println("#######DB.3 그림을 선택함");
                        third.setImageResource(R.drawable.art3);
                        third.setTag(R.id.third, R.drawable.art3);
                        drawableId3 = (Integer) third.getTag(R.id.third);
                    }
                });
                db4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click3 = 0;
                        System.out.println("#######DB.4 그림을 선택함");
                        third.setImageResource(R.drawable.art4);
                        third.setTag(R.id.third, R.drawable.art4);
                        drawableId3 = (Integer) third.getTag(R.id.third);
                    }
                });
                db5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click3 = 0;
                        System.out.println("#######DB.5 그림을 선택함");
                        third.setImageResource(R.drawable.art5);
                        third.setTag(R.id.third, R.drawable.art5);
                        drawableId3 = (Integer) third.getTag(R.id.third);
                    }
                });
                db6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click3 = 0;
                        System.out.println("#######DB.6 그림을 선택함");
                        third.setImageResource(R.drawable.art6);
                        third.setTag(R.id.third, R.drawable.art6);
                        drawableId3 = (Integer) third.getTag(R.id.third);
                    }
                });
                db7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click3 = 0;
                        System.out.println("#######DB.6 그림을 선택함");
                        third.setImageResource(R.drawable.art7);
                        third.setTag(R.id.third, R.drawable.art7);
                        drawableId3 = (Integer) third.getTag(R.id.third);
                    }
                });
                db8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click3 = 0;
                        System.out.println("#######DB.8 그림을 선택함");
                        third.setImageResource(R.drawable.art8);
                        third.setTag(R.id.third, R.drawable.art8);
                        drawableId3 = (Integer) third.getTag(R.id.third);
                    }
                });
                db9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click3 = 0;
                        System.out.println("#######DB.9 그림을 선택함");
                        third.setImageResource(R.drawable.art9);
                        third.setTag(R.id.third, R.drawable.art9);
                        drawableId3 = (Integer) third.getTag(R.id.third);
                    }
                });
                db10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click3 = 0;
                        System.out.println("#######DB.10그림을 선택함");
                        third.setImageResource(R.drawable.art1);
                        third.setTag(R.id.third, R.drawable.art1);
                        drawableId3 = (Integer) third.getTag(R.id.third);
                    }
                });
                db11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click3 = 0;
                        System.out.println("#######DB.11그림을 선택함");
                        third.setImageResource(R.drawable.art2);
                        third.setTag(R.id.third, R.drawable.art2);
                        drawableId3 = (Integer) third.getTag(R.id.third);
                    }
                });
                db12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click3 = 0;
                        System.out.println("#######DB.12 그림을 선택함");
                        third.setImageResource(R.drawable.art3);
                        third.setTag(R.id.third, R.drawable.art3);
                        drawableId3 = (Integer) third.getTag(R.id.third);
                    }
                });
            }

        });

        forth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click4 = 1;
                System.out.println("#########4번칸을 선택함");
                db1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click4 = 0;
                        System.out.println("#######DB.1 그림을 선택함");
                        forth.setImageResource(R.drawable.art1);
                        forth.setTag(R.id.forth, R.drawable.art1);
                        drawableId4 = (Integer) forth.getTag(R.id.forth);
                    }
                });
                db2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click4 = 0;
                        System.out.println("#######DB.2 그림을 선택함");
                        forth.setImageResource(R.drawable.art2);
                        forth.setTag(R.id.forth, R.drawable.art2);
                        drawableId4 = (Integer) forth.getTag(R.id.forth);
                    }
                });
                db3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click4 = 0;
                        System.out.println("#######DB.3그림을 선택함");
                        forth.setImageResource(R.drawable.art3);
                        forth.setTag(R.id.forth, R.drawable.art3);
                        drawableId4 = (Integer) forth.getTag(R.id.forth);
                    }
                });
                db4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click4 = 0;
                        System.out.println("#######DB.4 그림을 선택함");
                        forth.setImageResource(R.drawable.art4);
                        forth.setTag(R.id.forth, R.drawable.art4);
                        drawableId4 = (Integer) forth.getTag(R.id.forth);
                    }
                });
                db5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click4 = 0;
                        System.out.println("#######DB.5 그림을 선택함");
                        forth.setImageResource(R.drawable.art5);
                        forth.setTag(R.id.forth, R.drawable.art5);
                        drawableId4 = (Integer) forth.getTag(R.id.forth);
                    }
                });
                db6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click4 = 0;
                        System.out.println("#######DB.6 그림을 선택함");
                        forth.setImageResource(R.drawable.art6);
                        forth.setTag(R.id.forth, R.drawable.art6);
                        drawableId4 = (Integer) forth.getTag(R.id.forth);
                    }
                });
                db7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click4 = 0;
                        System.out.println("#######DB.7 그림을 선택함");
                        forth.setImageResource(R.drawable.art7);
                        forth.setTag(R.id.forth, R.drawable.art7);
                        drawableId4 = (Integer) forth.getTag(R.id.forth);
                    }
                });
                db8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click4 = 0;
                        System.out.println("#######DB.8 그림을 선택함");
                        forth.setImageResource(R.drawable.art8);
                        forth.setTag(R.id.forth, R.drawable.art8);
                        drawableId4 = (Integer) forth.getTag(R.id.forth);
                    }
                });
                db9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click4 = 0;
                        System.out.println("#######DB.9그림을 선택함");
                        forth.setImageResource(R.drawable.art9);
                        forth.setTag(R.id.forth, R.drawable.art9);
                        drawableId4 = (Integer) forth.getTag(R.id.forth);
                    }
                });
                db10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click4 = 0;
                        System.out.println("#######DB.10 그림을 선택함");
                        forth.setImageResource(R.drawable.art1);
                        forth.setTag(R.id.forth, R.drawable.art1);
                        drawableId4 = (Integer) forth.getTag(R.id.forth);
                    }
                });
                db11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click4 = 0;
                        System.out.println("#######DB.11 그림을 선택함");
                        forth.setImageResource(R.drawable.art2);
                        forth.setTag(R.id.forth, R.drawable.art2);
                        drawableId4 = (Integer) forth.getTag(R.id.forth);
                    }
                });
                db12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click4 = 0;
                        System.out.println("#######DB.12 그림을 선택함");
                        forth.setImageResource(R.drawable.art3);
                        forth.setTag(R.id.forth, R.drawable.art3);
                        drawableId4 = (Integer) forth.getTag(R.id.forth);
                    }
                });
            }

        });

        fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click5 = 1;
                System.out.println("#########5번칸을 선택함");
                db1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click5 = 0;
                        System.out.println("#######DB.1 그림을 선택함");
                        fifth.setImageResource(R.drawable.art1);
                        fifth.setTag(R.id.fifth, R.drawable.art1);
                        drawableId5 = (Integer) fifth.getTag(R.id.fifth);
                    }
                });
                db2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click5 = 0;
                        System.out.println("#######DB.2 그림을 선택함");
                        fifth.setImageResource(R.drawable.art2);
                        fifth.setTag(R.id.fifth, R.drawable.art2);
                        drawableId5 = (Integer) fifth.getTag(R.id.fifth);
                    }
                });
                db3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click5 = 0;
                        System.out.println("#######DB.3 그림을 선택함");
                        fifth.setImageResource(R.drawable.art3);
                        fifth.setTag(R.id.fifth, R.drawable.art3);
                        drawableId5 = (Integer) fifth.getTag(R.id.fifth);
                    }
                });
                db4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click5 = 0;
                        System.out.println("#######DB.4 그림을 선택함");
                        fifth.setImageResource(R.drawable.art4);
                        fifth.setTag(R.id.fifth, R.drawable.art4);
                        drawableId5 = (Integer) fifth.getTag(R.id.fifth);
                    }
                });
                db5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click5 = 0;
                        System.out.println("#######DB.5 그림을 선택함");
                        fifth.setImageResource(R.drawable.art5);
                        fifth.setTag(R.id.fifth, R.drawable.art5);
                        drawableId5 = (Integer) fifth.getTag(R.id.fifth);
                    }
                });
                db6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click5 = 0;
                        System.out.println("#######DB.6 그림을 선택함");
                        fifth.setImageResource(R.drawable.art6);
                        fifth.setTag(R.id.fifth, R.drawable.art6);
                        drawableId5 = (Integer) fifth.getTag(R.id.fifth);
                    }
                });
                db7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click5 = 0;
                        System.out.println("#######DB.7 그림을 선택함");
                        fifth.setImageResource(R.drawable.art7);
                        fifth.setTag(R.id.fifth, R.drawable.art7);
                        drawableId5 = (Integer) fifth.getTag(R.id.fifth);
                    }
                });
                db8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click5 = 0;
                        System.out.println("#######DB.8 그림을 선택함");
                        fifth.setImageResource(R.drawable.art8);
                        fifth.setTag(R.id.fifth, R.drawable.art8);
                        drawableId5 = (Integer) fifth.getTag(R.id.fifth);
                    }
                });
                db9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click5 = 0;
                        System.out.println("#######DB.9 그림을 선택함");
                        fifth.setImageResource(R.drawable.art9);
                        fifth.setTag(R.id.fifth, R.drawable.art9);
                        drawableId5 = (Integer) fifth.getTag(R.id.fifth);
                    }
                });
                db10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click5 = 0;
                        System.out.println("#######DB.10 그림을 선택함");
                        fifth.setImageResource(R.drawable.art1);
                        fifth.setTag(R.id.fifth, R.drawable.art1);
                        drawableId5 = (Integer) fifth.getTag(R.id.fifth);
                    }
                });
                db11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click5 = 0;
                        System.out.println("#######DB.11 그림을 선택함");
                        fifth.setImageResource(R.drawable.art2);
                        fifth.setTag(R.id.fifth, R.drawable.art2);
                        drawableId5 = (Integer) fifth.getTag(R.id.fifth);
                    }
                });
                db12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click5 = 0;
                        System.out.println("#######DB.12 그림을 선택함");
                        fifth.setImageResource(R.drawable.art3);
                        fifth.setTag(R.id.fifth, R.drawable.art3);
                        drawableId5 = (Integer) fifth.getTag(R.id.fifth);
                    }
                });
            }


        });

        sixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click6 = 1;
                System.out.println("#########6번칸을 선택함");
                db1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click6 = 0;
                        System.out.println("#######DB.1 그림을 선택함");
                        sixth.setImageResource(R.drawable.art1);
                        sixth.setTag(R.id.sixth, R.drawable.art1);
                        drawableId6 = (Integer) sixth.getTag(R.id.sixth);
                    }
                });
                db2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click6 = 0;
                        System.out.println("#######DB.2 그림을 선택함");
                        sixth.setImageResource(R.drawable.art2);
                        sixth.setTag(R.id.sixth, R.drawable.art2);
                        drawableId6 = (Integer) sixth.getTag(R.id.sixth);
                    }
                });
                db3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click6 = 0;
                        System.out.println("#######DB.3 그림을 선택함");
                        sixth.setImageResource(R.drawable.art3);
                        sixth.setTag(R.id.sixth, R.drawable.art3);
                        drawableId6 = (Integer) sixth.getTag(R.id.sixth);
                    }
                });
                db4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click6 = 0;
                        System.out.println("#######DB.4 그림을 선택함");
                        sixth.setImageResource(R.drawable.art4);
                        sixth.setTag(R.id.sixth, R.drawable.art4);
                        drawableId6 = (Integer) sixth.getTag(R.id.sixth);
                    }
                });
                db5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click6 = 0;
                        System.out.println("#######DB.5 그림을 선택함");
                        sixth.setImageResource(R.drawable.art5);
                        sixth.setTag(R.id.sixth, R.drawable.art5);
                        drawableId6 = (Integer) sixth.getTag(R.id.sixth);
                    }
                });
                db6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click6 = 0;
                        System.out.println("#######DB.6그림을 선택함");
                        sixth.setImageResource(R.drawable.art6);
                        sixth.setTag(R.id.sixth, R.drawable.art6);
                        drawableId6 = (Integer) sixth.getTag(R.id.sixth);
                    }
                });
                db7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click6 = 0;
                        System.out.println("#######DB.7 그림을 선택함");
                        sixth.setImageResource(R.drawable.art7);
                        sixth.setTag(R.id.sixth, R.drawable.art7);
                        drawableId6 = (Integer) sixth.getTag(R.id.sixth);
                    }
                });
                db8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click6 = 0;
                        System.out.println("#######DB.8 그림을 선택함");
                        sixth.setImageResource(R.drawable.art8);
                        sixth.setTag(R.id.sixth, R.drawable.art8);
                        drawableId6 = (Integer) sixth.getTag(R.id.sixth);
                    }
                });
                db9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click6 = 0;
                        System.out.println("#######DB.9 그림을 선택함");
                        sixth.setImageResource(R.drawable.art9);
                        sixth.setTag(R.id.sixth, R.drawable.art9);
                        drawableId6 = (Integer) sixth.getTag(R.id.sixth);
                    }
                });
                db10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click6 = 0;
                        System.out.println("#######DB.10 그림을 선택함");
                        sixth.setImageResource(R.drawable.art1);
                        sixth.setTag(R.id.sixth, R.drawable.art1);
                        drawableId6 = (Integer) sixth.getTag(R.id.sixth);
                    }
                });
                db11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click6 = 0;
                        System.out.println("#######DB.11 그림을 선택함");
                        sixth.setImageResource(R.drawable.art2);
                        sixth.setTag(R.id.sixth, R.drawable.art2);
                        drawableId6 = (Integer) sixth.getTag(R.id.sixth);
                    }
                });
                db12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click6 = 0;
                        System.out.println("#######DB.12 그림을 선택함");
                        sixth.setImageResource(R.drawable.art3);
                        sixth.setTag(R.id.sixth, R.drawable.art3);
                        drawableId6 = (Integer) sixth.getTag(R.id.sixth);
                    }
                });
            }


        });

        seventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click7 = 1;
                System.out.println("#########7번칸을 선택함");
                db1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click7 = 0;
                        System.out.println("#######DB.1 그림을 선택함");
                        seventh.setImageResource(R.drawable.art1);
                        seventh.setTag(R.id.seventh, R.drawable.art1);
                        drawableId7 = (Integer) seventh.getTag(R.id.seventh);
                    }
                });
                db2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click7 = 0;
                        System.out.println("#######DB.2 그림을 선택함");
                        seventh.setImageResource(R.drawable.art2);
                        seventh.setTag(R.id.seventh, R.drawable.art2);
                        drawableId7 = (Integer) seventh.getTag(R.id.seventh);
                    }
                });
                db3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click7 = 0;
                        System.out.println("#######DB.3 그림을 선택함");
                        seventh.setImageResource(R.drawable.art3);
                        seventh.setTag(R.id.seventh, R.drawable.art3);
                        drawableId7 = (Integer) seventh.getTag(R.id.seventh);
                    }
                });
                db4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click7 = 0;
                        System.out.println("#######DB.4 그림을 선택함");
                        seventh.setImageResource(R.drawable.art4);
                        seventh.setTag(R.id.seventh, R.drawable.art4);
                        drawableId7 = (Integer) seventh.getTag(R.id.seventh);
                    }
                });
                db5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click7 = 0;
                        System.out.println("#######DB.5 그림을 선택함");
                        seventh.setImageResource(R.drawable.art5);
                        seventh.setTag(R.id.seventh, R.drawable.art5);
                        drawableId7 = (Integer) seventh.getTag(R.id.seventh);
                    }
                });
                db6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click7 = 0;
                        System.out.println("#######DB.6 그림을 선택함");
                        seventh.setImageResource(R.drawable.art6);
                        seventh.setTag(R.id.seventh, R.drawable.art6);
                        drawableId7 = (Integer) seventh.getTag(R.id.seventh);
                    }
                });
                db7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click7 = 0;
                        System.out.println("#######DB.7 그림을 선택함");
                        seventh.setImageResource(R.drawable.art7);
                        seventh.setTag(R.id.seventh, R.drawable.art7);
                        drawableId7 = (Integer) seventh.getTag(R.id.seventh);
                    }
                });
                db8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click7 = 0;
                        System.out.println("#######DB.8 그림을 선택함");
                        seventh.setImageResource(R.drawable.art8);
                        seventh.setTag(R.id.seventh, R.drawable.art8);
                        drawableId7 = (Integer) seventh.getTag(R.id.seventh);
                    }
                });
                db9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click7 = 0;
                        System.out.println("#######DB.9 그림을 선택함");
                        seventh.setImageResource(R.drawable.art9);
                        seventh.setTag(R.id.seventh, R.drawable.art9);
                        drawableId7 = (Integer) seventh.getTag(R.id.seventh);
                    }
                });
                db10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click7 = 0;
                        System.out.println("#######DB.10 그림을 선택함");
                        seventh.setImageResource(R.drawable.art1);
                        seventh.setTag(R.id.seventh, R.drawable.art1);
                        drawableId7 = (Integer) seventh.getTag(R.id.seventh);
                    }
                });
                db11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click7 = 0;
                        System.out.println("#######DB.11 그림을 선택함");
                        seventh.setImageResource(R.drawable.art2);
                        seventh.setTag(R.id.seventh, R.drawable.art2);
                        drawableId7 = (Integer) seventh.getTag(R.id.seventh);
                    }
                });
                db12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click7 = 0;
                        System.out.println("#######DB.12 그림을 선택함");
                        seventh.setImageResource(R.drawable.art3);
                        seventh.setTag(R.id.seventh, R.drawable.art3);
                        drawableId7 = (Integer) seventh.getTag(R.id.seventh);
                    }
                });
            }

        });

        eighth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click8 = 1;
                System.out.println("#########8번칸을 선택함");
                db1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click8 = 0;
                        System.out.println("#######DB.1 그림을 선택함");
                        eighth.setImageResource(R.drawable.art1);
                        eighth.setTag(R.id.eighth, R.drawable.art1);
                        drawableId8 = (Integer) eighth.getTag(R.id.eighth);
                    }
                });
                db2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click8 = 0;
                        System.out.println("#######DB.2 그림을 선택함");
                        eighth.setImageResource(R.drawable.art2);
                        eighth.setTag(R.id.eighth, R.drawable.art2);
                        drawableId8 = (Integer) eighth.getTag(R.id.eighth);
                    }
                });
                db3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click8 = 0;
                        System.out.println("#######DB.3 그림을 선택함");
                        eighth.setImageResource(R.drawable.art3);
                        eighth.setTag(R.id.eighth, R.drawable.art3);
                        drawableId8 = (Integer) eighth.getTag(R.id.eighth);
                    }
                });
                db4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click8 = 0;
                        System.out.println("#######DB.4 그림을 선택함");
                        eighth.setImageResource(R.drawable.art4);
                        eighth.setTag(R.id.eighth, R.drawable.art4);
                        drawableId8 = (Integer) eighth.getTag(R.id.eighth);
                    }
                });
                db5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click8 = 0;
                        System.out.println("#######DB.5 그림을 선택함");
                        eighth.setImageResource(R.drawable.art5);
                        eighth.setTag(R.id.eighth, R.drawable.art5);
                        drawableId8 = (Integer) eighth.getTag(R.id.eighth);
                    }
                });
                db6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click8 = 0;
                        System.out.println("#######DB.6그림을 선택함");
                        eighth.setImageResource(R.drawable.art6);
                        eighth.setTag(R.id.eighth, R.drawable.art6);
                        drawableId8 = (Integer) eighth.getTag(R.id.eighth);
                    }
                });
                db7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click8 = 0;
                        System.out.println("#######DB.7그림을 선택함");
                        eighth.setImageResource(R.drawable.art7);
                        eighth.setTag(R.id.eighth, R.drawable.art7);
                        drawableId8 = (Integer) eighth.getTag(R.id.eighth);
                    }
                });
                db8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click8 = 0;
                        System.out.println("#######DB.1 그림을 선택함");
                        eighth.setImageResource(R.drawable.art8);
                        eighth.setTag(R.id.eighth, R.drawable.art8);
                        drawableId8 = (Integer) eighth.getTag(R.id.eighth);
                    }
                });
                db9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click8 = 0;
                        System.out.println("#######DB.9그림을 선택함");
                        eighth.setImageResource(R.drawable.art9);
                        eighth.setTag(R.id.eighth, R.drawable.art9);
                        drawableId8 = (Integer) eighth.getTag(R.id.eighth);
                    }
                });
                db10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click8 = 0;
                        System.out.println("#######DB.10그림을 선택함");
                        eighth.setImageResource(R.drawable.art1);
                        eighth.setTag(R.id.eighth, R.drawable.art1);
                        drawableId8 = (Integer) eighth.getTag(R.id.eighth);
                    }
                });
                db11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click8 = 0;
                        System.out.println("#######DB.11 그림을 선택함");
                        eighth.setImageResource(R.drawable.art2);
                        eighth.setTag(R.id.eighth, R.drawable.art2);
                        drawableId8 = (Integer) eighth.getTag(R.id.eighth);
                    }
                });
                db12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click8 = 0;
                        System.out.println("#######DB.12 그림을 선택함");
                        eighth.setImageResource(R.drawable.art3);
                        eighth.setTag(R.id.eighth, R.drawable.art3);
                        drawableId8 = (Integer) eighth.getTag(R.id.eighth);
                    }
                });
            }

        });

        ninth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click9 = 1;
                System.out.println("#########9번칸을 선택함");
                db1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click9 = 0;
                        System.out.println("#######DB.1 그림을 선택함");
                        ninth.setImageResource(R.drawable.art1);
                        ninth.setTag(R.id.ninth, R.drawable.art1);
                        drawableId9 = (Integer) ninth.getTag(R.id.ninth);
                    }
                });
                db2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click9 = 0;
                        System.out.println("#######DB.2 그림을 선택함");
                        ninth.setImageResource(R.drawable.art2);
                        ninth.setTag(R.id.ninth, R.drawable.art2);
                        drawableId9 = (Integer) ninth.getTag(R.id.ninth);
                    }
                });
                db3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click9 = 0;
                        System.out.println("#######DB.3 그림을 선택함");
                        ninth.setImageResource(R.drawable.art3);
                        ninth.setTag(R.id.ninth, R.drawable.art3);
                        drawableId9 = (Integer) ninth.getTag(R.id.ninth);
                    }
                });
                db4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click9 = 0;
                        System.out.println("#######DB.4 그림을 선택함");
                        ninth.setImageResource(R.drawable.art4);
                        ninth.setTag(R.id.ninth, R.drawable.art4);
                        drawableId9 = (Integer) ninth.getTag(R.id.ninth);
                    }
                });
                db5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click9 = 0;
                        System.out.println("#######DB.5그림을 선택함");
                        ninth.setImageResource(R.drawable.art5);
                        ninth.setTag(R.id.ninth, R.drawable.art5);
                        drawableId9 = (Integer) ninth.getTag(R.id.ninth);
                    }
                });
                db6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click9 = 0;
                        System.out.println("#######DB.6그림을 선택함");
                        ninth.setImageResource(R.drawable.art6);
                        ninth.setTag(R.id.ninth, R.drawable.art6);
                        drawableId9 = (Integer) ninth.getTag(R.id.ninth);
                    }
                });
                db7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click9 = 0;
                        System.out.println("#######DB.7 그림을 선택함");
                        ninth.setImageResource(R.drawable.art7);
                        ninth.setTag(R.id.ninth, R.drawable.art7);
                        drawableId9 = (Integer) ninth.getTag(R.id.ninth);
                    }
                });
                db8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click9 = 0;
                        System.out.println("#######DB.8 그림을 선택함");
                        ninth.setImageResource(R.drawable.art8);
                        ninth.setTag(R.id.ninth, R.drawable.art8);
                        drawableId9 = (Integer) ninth.getTag(R.id.ninth);
                    }
                });
                db9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click9 = 0;
                        System.out.println("#######DB.9 그림을 선택함");
                        ninth.setImageResource(R.drawable.art9);
                        ninth.setTag(R.id.ninth, R.drawable.art9);
                        drawableId9 = (Integer) ninth.getTag(R.id.ninth);
                    }
                });
                db10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click9 = 0;
                        System.out.println("#######DB.10 그림을 선택함");
                        ninth.setImageResource(R.drawable.art1);
                        ninth.setTag(R.id.ninth, R.drawable.art1);
                        drawableId9 = (Integer) ninth.getTag(R.id.ninth);
                    }
                });
                db11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click9 = 0;
                        System.out.println("#######DB.11그림을 선택함");
                        ninth.setImageResource(R.drawable.art2);
                        ninth.setTag(R.id.ninth, R.drawable.art2);
                        drawableId9 = (Integer) ninth.getTag(R.id.ninth);
                    }
                });
                db12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        click9 = 0;
                        System.out.println("#######DB.12 그림을 선택함");
                        ninth.setImageResource(R.drawable.art3);
                        ninth.setTag(R.id.ninth, R.drawable.art3);
                        drawableId9 = (Integer) ninth.getTag(R.id.ninth);
                    }
                });
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetFunction();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click1 == 1) {
                    first.setImageResource(0);
                } else if (click2 == 1) {
                    second.setImageResource(0);
                } else if (click3 == 1) {
                    third.setImageResource(0);
                } else if (click4 == 1) {
                    forth.setImageResource(0);
                } else if (click5 == 1) {
                    fifth.setImageResource(0);
                } else if (click6 == 1) {
                    sixth.setImageResource(0);
                } else if (click7 == 1) {
                    seventh.setImageResource(0);
                } else if (click8 == 1) {
                    eighth.setImageResource(0);
                } else {
                    ninth.setImageResource(0);
                }
            }
        });

        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog(v);
            }
        });

        alter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(click1 == 1 && click2 == 1) {
                    first.setImageResource(drawableId2);
                    second.setImageResource(drawableId1);
                }
                else if(click1 == 1 && click3 ==1) {
                    first.setImageResource(drawableId3);
                    third.setImageResource(drawableId1);
                }
                else if(click1 == 1 && click4 ==1) {
                    first.setImageResource(drawableId4);
                    forth.setImageResource(drawableId1);
                }
                else if(click1 == 1 && click5 ==1) {
                    first.setImageResource(drawableId5);
                    fifth.setImageResource(drawableId1);
                }
                else if(click1 == 1 && click6 ==1) {
                    first.setImageResource(drawableId6);
                    sixth.setImageResource(drawableId1);
                }
                else if(click1 == 1 && click7==1) {
                    first.setImageResource(drawableId7);
                    seventh.setImageResource(drawableId1);
                }
                else if(click1 == 1 && click8 ==1) {
                    first.setImageResource(drawableId8);
                    eighth.setImageResource(drawableId1);
                }
                else if(click1 == 1 && click9 ==1) {
                    first.setImageResource(drawableId9);
                    ninth.setImageResource(drawableId1);
                }


                else if(click2 == 1 && click3 ==1) {
                    second.setImageResource(drawableId3);
                    third.setImageResource(drawableId2);
                }
                else if(click2 == 1 && click4 ==1) {
                    second.setImageResource(drawableId4);
                    forth.setImageResource(drawableId2);
                }
                else if(click2 == 1 && click5 ==1) {
                    second.setImageResource(drawableId5);
                    fifth.setImageResource(drawableId2);
                }
                else if(click2 == 1 && click6==1) {
                    second.setImageResource(drawableId6);
                    sixth.setImageResource(drawableId2);
                }
                else if(click2 == 1 && click7 ==1) {
                    second.setImageResource(drawableId7);
                    seventh.setImageResource(drawableId2);
                }
                else if(click2 == 1 && click8 ==1) {
                    second.setImageResource(drawableId8);
                    eighth.setImageResource(drawableId2);
                }
                else if(click2 == 1 && click9 ==1) {
                    second.setImageResource(drawableId9);
                    ninth.setImageResource(drawableId2);
                }


                else if(click3 == 1 && click4 ==1) {
                    third.setImageResource(drawableId4);
                    forth.setImageResource(drawableId3);
                }
                else if(click3 == 1 && click5 ==1) {
                    third.setImageResource(drawableId5);
                    fifth.setImageResource(drawableId3);
                }
                else if(click3 == 1 && click6 ==1) {
                    third.setImageResource(drawableId6);
                    sixth.setImageResource(drawableId3);
                }
                else if(click3 == 1 && click7 ==1) {
                    third.setImageResource(drawableId7);
                    seventh.setImageResource(drawableId3);
                }
                else if(click3 == 1 && click8 ==1) {
                    third.setImageResource(drawableId8);
                    eighth.setImageResource(drawableId3);
                }
                else if(click3 == 1 && click9 ==1) {
                    third.setImageResource(drawableId9);
                    ninth.setImageResource(drawableId3);
                }


                else if(click4 == 1 && click5 ==1) {
                    forth.setImageResource(drawableId5);
                    fifth.setImageResource(drawableId4);
                }
                else if(click4 == 1 && click6 ==1) {
                    forth.setImageResource(drawableId6);
                    sixth.setImageResource(drawableId4);
                }
                else if(click4 == 1 && click7 ==1) {
                    forth.setImageResource(drawableId7);
                    seventh.setImageResource(drawableId4);
                }
                else if(click4 == 1 && click8 ==1) {
                    forth.setImageResource(drawableId8);
                    eighth.setImageResource(drawableId4);
                }
                else if(click4 == 1 && click9 ==1) {
                    forth.setImageResource(drawableId9);
                    ninth.setImageResource(drawableId4);
                }


                else if(click5 == 1 && click6 ==1) {
                    fifth.setImageResource(drawableId6);
                    sixth.setImageResource(drawableId5);
                }
                else if(click5 == 1 && click7 ==1) {
                    fifth.setImageResource(drawableId7);
                    seventh.setImageResource(drawableId5);
                }
                else if(click5 == 1 && click8 ==1) {
                    fifth.setImageResource(drawableId8);
                    eighth.setImageResource(drawableId5);
                }
                else if(click5 == 1 && click9 ==1) {
                    fifth.setImageResource(drawableId9);
                    ninth.setImageResource(drawableId5);
                }


                else if(click6 == 1 && click7 ==1) {
                    sixth.setImageResource(drawableId7);
                    seventh.setImageResource(drawableId6);
                }
                else if(click6 == 1 && click8 ==1) {
                    sixth.setImageResource(drawableId8);
                    seventh.setImageResource(drawableId6);
                }
                else if(click6 == 1 && click9 ==1) {
                    sixth.setImageResource(drawableId9);
                    seventh.setImageResource(drawableId6);
                }


                else if(click7 == 1 && click8 ==1) {
                    seventh.setImageResource(drawableId8);
                    eighth.setImageResource(drawableId7);
                }
                else if(click7 == 1 && click9 ==1) {
                    seventh.setImageResource(drawableId9);
                    ninth.setImageResource(drawableId7);
                }


                else if(click8 == 1 && click9 ==1) {
                    eighth.setImageResource(drawableId9);
                    ninth.setImageResource(drawableId8);
                }


            }
        });


    }

    public void dialog(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Image_Save");
        builder.setMessage("Do you want to save this curating?");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                palette_state++; // 팔레트 추가
                System.out.println(palette_state);
                resetFunction();
            }
        });
        builder.setNegativeButton("No", null);
        AlertDialog dialog = builder.create();
        dialog.show();

    }

    public void resetFunction() {
        first.setImageResource(0);
        second.setImageResource(0);
        third.setImageResource(0);
        forth.setImageResource(0);
        fifth.setImageResource(0);
        sixth.setImageResource(0);
        seventh.setImageResource(0);
        eighth.setImageResource(0);
        ninth.setImageResource(0);
        click1 = 0;
        click2 = 0;
        click3 = 0;
        click4 = 0;
        click5 = 0;
        click6 = 0;
        click7 = 0;
        click8 = 0;
        click9 = 0;

        palette_state = 0;
    }


}