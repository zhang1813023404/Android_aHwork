package moe.xinmu.android.ahwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.HashMap;

public class Main2Activity extends AppCompatActivity {
    LinearLayout ll;
    HashMap<View,String> vsh=new HashMap<>();
    HashMap<String,String> ss=new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //getActionBar().setDisplayHomeAsUpEnabled(true);
        ll=findViewById(R.id.main2_usersettings);
        dataget();
        createOptionTab("蛤","笑");
    }

    private void dataget() {

    }

    View createOptionTab(String name,String value){
        View a=ll.inflate(this,R.layout.items_option_tab,null);
        ((TextView)a.findViewById(R.id.iot_setting_name)).setText(name);
        TextView tv=a.findViewById(R.id.iot_setting_value);
        LinearLayout bt=a.findViewById(R.id.tab_ll);
        vsh.put(bt,name);
        bt.setOnClickListener(this::tab_onClick);
        tv.setText(value);
        ll.addView(a);
        return a;
    }
    void tab_onClick(View v){
        Log.i("asdfgh",vsh.get(v));
        //TODO
    }
}
