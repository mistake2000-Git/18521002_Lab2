package uit.lab1.bai1_lab2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Menu OptionMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView im = findViewById(R.id.img);
        registerForContextMenu(im);
    }
//    @Override
//    public boolean onPrepareOptionsMenu(Menu menu) {
//        menu.clear(); //Clear view of previous menu
//        MenuInflater inflater = getMenuInflater();
//        if()
//            inflater.inflate(R.menu.menu_one, menu);
//        else
//            inflater.inflate(R.menu.menu_two, menu);
//        return super.onPrepareOptionsMenu(menu);
//    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater im = getMenuInflater();
        im.inflate(R.menu.option_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_ot_file:
                Toast.makeText(getApplicationContext(), "File", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_ot_edit:
                Toast.makeText(getApplicationContext(), "Edit", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu_ot_view:
                Toast.makeText(getApplicationContext(), "View", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu_ot_tool:
                Toast.makeText(getApplicationContext(), "Tool", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater im = getMenuInflater();
        im.inflate(R.menu.context_menu,menu);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
       Toast.makeText(MainActivity.this, item.getTitle(),Toast.LENGTH_SHORT).show();
       return true;
    }
}