package ru.istislav.fragmentMyCourse;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import ru.istislav.fragmentMyCourse.data.Course;

public class CourseDetailFragment extends Fragment {
    Course course;

    // required no-args constuctor
    public CourseDetailFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.course_detail_fragment, container, false);

        if(course != null) {
            TextView courseName = view.findViewById(R.id.detailCourseName);
            courseName.setText(course.getCourseName());

            ImageView courseImage = view.findViewById(R.id.detailCourseImage);
            courseImage.setImageResource(course.getImageResourceId(getActivity()));

            TextView courseDescription = view.findViewById(R.id.detailCourseDescription);
            courseDescription.setText(course.getCourseName());
        }

        return view;
    }
}
