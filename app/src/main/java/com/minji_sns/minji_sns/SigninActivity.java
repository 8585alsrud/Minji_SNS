package com.minji_sns.minji_sns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SigninActivity extends AppCompatActivity {


    //Button goBtn; //XML에서 가져와 사용할 레퍼런스 생성
    EditText edit1, edit2, edit3, edit4; // 에딧 텍스트레퍼런스 생성

    View.OnClickListener bHandler = new View.OnClickListener() { //버튼기능생성
        @Override
        public void onClick(View view) {
            Toast.makeText(SigninActivity.this, "버튼을 눌렀습니다.", Toast.LENGTH_SHORT).show();

            String str1 = edit1.getText().toString();
            String str2 = edit2.getText().toString();
            String str3 = edit3.getText().toString();
            String str4 = edit4.getText().toString();

            Intent intent = new Intent(SigninActivity.this, MainActivity.class);
            intent.putExtra("str1", str1);
            intent.putExtra("str2", str2);
            intent.putExtra("str3", str3);
            intent.putExtra("str3", str4);
            startActivity(intent);
            overridePendingTransition(R.anim.move_r_c, R.anim.move_c_l);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);
        edit3 = (EditText) findViewById(R.id.edit3);
        edit4 = (EditText) findViewById(R.id.edit4);
//        goBtn = (Button) findViewById(R.id.goBtn); //레퍼런스에 XML에서 ID를 기반으로 가져오기
//        goBtn.setOnClickListener(bHandler);//버튼에 버튼을 클릭하면 발생하는 기능 연결하기
    }

    public void btnClickEvent(View v){
        Toast.makeText(SigninActivity.this, "버튼을 눌렀습니다.", Toast.LENGTH_SHORT).show();
    }

}
