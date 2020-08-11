package ru.istislav.fragmentMyCourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.Toast;

import ru.istislav.fragmentMyCourse.data.Course;
import ru.istislav.fragmentMyCourse.data.CourseListFragment;

public class MainActivity extends AppCompatActivity implements CourseListFragment.Callbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        FragmentManager fm = getSupportFragmentManager();
//        Fragment fragment = fm.findFragmentById(R.id.myContainer);
//        if (fragment == null) {
//            fragment = new CourseListFragment();
//            fm.beginTransaction().add(R.id.myContainer, fragment).commit();
//        }


    }

    @Override
    public void onItemSelected(Course course) {
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();;
    }

}
