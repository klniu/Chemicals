package com.guoyaohua.chemicals;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.guoyaohua.chemicals.R;
import com.guoyaohua.chemicals.tool_instruction;
import com.guoyaohua.chemicals.tool_set;
import com.guoyaohua.chemicals.tool_tool;
import com.guoyaohua.chemicals.tool_we;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 * Created by 谢仪頔 on 2016/7/18.
 */
public class tool_tool extends AppCompatActivity {
    public static String tool_tool_title[] = new String[]{"危险化学品名录汇编", "危险化学品相关法规", "危险化学品事故应急处置", "危险化学品事故消防救援", "危险化学品事故环境应急及弃物处置建议"};
    private ListView mList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tool_tool_layout);
        mList = (ListView)findViewById(R.id.lv_tool_tool);
        List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
        HashMap<String, Object> map;
        for (int i = 0; i < 5; i++) {
            map = new HashMap<String, Object>();
            map.put("tool_tool_title", tool_tool_title[i]);
            list.add(map);
        }
        SimpleAdapter simAdapter = new SimpleAdapter(this, list, R.layout.tool_tool_item_layout, new String[]{"tool_tool_title"}, new int[]{R.id.tx_tool_tool});
        mList.setAdapter(simAdapter);
        mList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = null;
                switch (position) {
                    case 0:
                        //intent = new Intent(view.getContext(), tool_tool.class);
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://minglu.707070.cn/show-2391965.html")));
                        break;
                    case 1:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://wenku.baidu.com/link?url=XtJytbtXBLEYhKYGysCWQaCmMjYlYx4MCPZSjJgy9MCTmDrnGb56OVebx4s1aiVd6oEOvPeYGT7C2ZrbXF7t6cMJPl3SmBq4S9QasqA08Ne")));
                        break;
                    case 2:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.guanyang.gov.cn/(S(msdpl1bt0v3s2ponstohswoz))/News/Display.aspx?aid=110112")));
                        break;
                    case 3:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://119.china.com.cn/zbjs/txt/2014-04/17/content_6828361.htm")));
                        break;
                    case 4:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.safehoo.com/manage/system/petroleum/201009/50382.shtml")));
                        break;
                }
            }
        });
    }

    public void click(View view){
        this.finish();
    }
}

