package ru.istislav.fragmentMyCourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import ru.istislav.fragmentMyCourse.data.Course;
import ru.istislav.fragmentMyCourse.data.CourseListFragment;

public class MainActivity extends AppCompatActivity implements CourseListFragment.Callbacks {

    private boolean isTwoPage = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.detailContainer) != null) {
            isTwoPage = true;
        }



    }

    @Override
    public void onItemSelected(Course course, int position) {
        if (isTwoPage) {
            Bundle bundle = new Bundle();
            bundle.putInt("course_id", position);

            FragmentManager fm = getSupportFragmentManager();
            CourseDetailFragment courseDetailFragment = new CourseDetailFragment();
            courseDetailFragment.setArguments(bundle);
            // Attention! You need to use replace, not add!
            fm.beginTransaction().replace(R.id.detailContainer, courseDetailFragment).commit();
        } else {
            Intent intent = new Intent(MainActivity.this, CourseDetailActivity.class);
            intent.putExtra("course_id", position);
            startActivity(intent);
        }
    }

}
