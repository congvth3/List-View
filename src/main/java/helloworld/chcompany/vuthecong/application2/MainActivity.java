package helloworld.chcompany.vuthecong.application2;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1. Khởi tạo dữ liệu cho mảng arr (còn gọi là data source)
        //final String arr[]={"1"};
        //2. Lấy đối tượng Listview dựa vào id
        ArrayList arr = new ArrayList();
        for (int i = 1; i < 100; i++)
        {
            arr.add(i);
        }
        //String list = arr.toString();
        ListView lv=(ListView) findViewById(R.id.lvperson);
        //3. Gán Data source vào ArrayAdapter
        ArrayAdapter<String>adapter=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, arr);
        //4. Đưa Data source vào ListView
        lv.setAdapter(adapter);
        final TextView txt=(TextView) findViewById(R.id.txtselection);
        //5. Thiết lập sự kiện cho Listview, khi chọn phần tử nào thì hiển thị lên TextView
        lv.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> arg0,
                                            View view,
                                            int position,
                                            long id) {
                        String product = ((TextView) view).getText().toString();
                        Intent i = new Intent(getApplicationContext(),SingleListViewItem.class);
                        i.putExtra("product", product);
                        startActivity(i);
                    }
                });
    }
}

