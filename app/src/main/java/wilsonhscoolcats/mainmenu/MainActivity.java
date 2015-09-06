package wilsonhscoolcats.mainmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    ViewGroup ugensLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void startGame(View view){
        Intent game = new Intent(this, Game.class);
        startActivity(game);
    }
    public void options(View view){
        Intent optionsMenu = new Intent(this, optionsMenu.class);
        startActivity(optionsMenu);
    }
    public void achievements(View view){
        Intent achievementsMenu = new Intent(this, achievementsMenu.class);
        startActivity(achievementsMenu);
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
}
