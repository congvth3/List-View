package helloworld.chcompany.vuthecong.application2;

/**
 * Created by vuthecong on 10/16/15.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class SingleListViewItem extends Activity{
    @Override
    public void onCreate (Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        this.setContentView(R.layout.list_item);
        TextView txtProduct = (TextView) findViewById(R.id.product_label);
        Intent i = getIntent();
        String product = i.getStringExtra("product");
        txtProduct.setText(product);

    }
}
