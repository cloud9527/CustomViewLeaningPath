package com.example.cloud.customviewleaningpath;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager pager;
    List<PageModel> pageModels = new ArrayList<>();
    {
        pageModels.add(new PageModel("柱状图",R.layout.view_draw_histogram));
        pageModels.add(new PageModel("drawColor",R.layout.view_draw_color));
        pageModels.add(new PageModel("drawCircle",R.layout.view_draw_circle));
        pageModels.add(new PageModel("drawrect",R.layout.view_draw_rect));
        pageModels.add(new PageModel("point",R.layout.view_draw_point));
        pageModels.add(new PageModel("oval",R.layout.view_draw_oval));
        pageModels.add(new PageModel("line",R.layout.view_draw_line));
        pageModels.add(new PageModel("roundrect",R.layout.view_draw_rount_rect));
        pageModels.add(new PageModel("arc",R.layout.view_draw_arc));
        pageModels.add(new PageModel("path",R.layout.view_draw_path));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {

            @Override
            public Fragment getItem(int position) {
                PageModel pageModel = pageModels.get(position);
                return PageFragment.newInstance(pageModel.practiceLayoutRes);
            }

            @Override
            public int getCount() {
                return pageModels.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return pageModels.get(position).titleRes;
            }
        });

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(pager);

    }

    private class PageModel {
        String titleRes;
        @LayoutRes int practiceLayoutRes;

        PageModel(String titleRes, @LayoutRes int practiceLayoutRes) {
            this.titleRes = titleRes;
            this.practiceLayoutRes = practiceLayoutRes;
        }
    }
}
