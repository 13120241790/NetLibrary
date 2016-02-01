package cn.rongcloud.library;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import rongcloud.netlibrary.network.async.OnDataListener;
import rongcloud.netlibrary.network.http.HttpException;

/**
 * 详细示例用法请参考 https://github.com/13120241790/SeaStar
 */
public class MainActivity extends AppCompatActivity implements OnDataListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public Object doInBackground(int requsetCode) throws HttpException {
        return null; //异步请求
    }

    @Override
    public void onSuccess(int requestCode, Object result) {
        //成功返回结果的回调
    }

    @Override
    public void onFailure(int requestCode, int state, Object result) {
        //失败的回调
    }
}
