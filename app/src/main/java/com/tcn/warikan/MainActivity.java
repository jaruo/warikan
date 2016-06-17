package com.tcn.warikan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      EditTextのオブジェクトと紐づけ
        EditText totalCost = (EditText)findViewById(R.id.inputTotalCost);
        EditText numOfPpl = (EditText)findViewById(R.id.inputNumOfPpl);

//      入力値を数値のみに限定
        totalCost.setInputType(InputType.TYPE_CLASS_NUMBER);
        numOfPpl.setInputType(InputType.TYPE_CLASS_NUMBER);

//      入力値が変更された際にイベントを発生させる
        totalCost.addTextChangedListener(watchHandlerTc);
        numOfPpl.addTextChangedListener(watchHandlerNop);
    }

//  入力値が変更された際のイベント処理（totalCost）
    private TextWatcher watchHandlerTc = new TextWatcher() {

//      変更前のイベント
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//            Log.d(TAG, "beforeTextChanged() s:" + s.toString() + " start:" + String.valueOf(start) + " count:" + String.valueOf(count) +
//                    " after:" + String.valueOf(after));
        }

//      変更中のイベント
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
//            Log.d(TAG, "onTextChanged() s:" + s.toString() + " start:" + String.valueOf(start) + " before:" + String.valueOf(before) +
//                    " count:" + String.valueOf(count));

            TextView HMPpl = (TextView)findViewById(R.id.showHMPpl);

            HMPpl.setText(s.toString());
        }

//      変更後のイベント
        @Override
        public void afterTextChanged(Editable s) {
//            Log.d(TAG, "afterTextChanged()");
        }
    };

    //  入力値が変更された際のイベント処理（NumOfPpl）
    private TextWatcher watchHandlerNop = new TextWatcher() {

//      変更前のイベント
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//            Log.d(TAG, "beforeTextChanged() s:" + s.toString() + " start:" + String.valueOf(start) + " count:" + String.valueOf(count) +
//                    " after:" + String.valueOf(after));
        }

//      変更中のイベント
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
//            Log.d(TAG, "onTextChanged() s:" + s.toString() + " start:" + String.valueOf(start) + " before:" + String.valueOf(before) +
//                    " count:" + String.valueOf(count));

            TextView PrcDiff = (TextView)findViewById(R.id.showPrcDiff);
        }

//      変更後のイベント
        @Override
        public void afterTextChanged(Editable s) {
//            Log.d(TAG, "afterTextChanged()");
        }
    };
}
