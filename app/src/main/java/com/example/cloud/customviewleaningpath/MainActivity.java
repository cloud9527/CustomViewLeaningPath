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
        pageModels.add(new PageModel("Practice14GetFontMetricsView",R.layout.practice_get_font_metrics));
        pageModels.add(new PageModel("Practice13GetTextBoundsView",R.layout.practice_get_text_bounds));
        pageModels.add(new PageModel("Practice12MeasureTextView",R.layout.practice_measure_text));
        pageModels.add(new PageModel("Practice11GetFontSpacingView",R.layout.practice_get_font_spacing));
        pageModels.add(new PageModel("Practice10SetTextAlignView",R.layout.practice_set_text_align));
        pageModels.add(new PageModel("Practice09SetTextScaleXView",R.layout.practice_set_text_scale_x));
        pageModels.add(new PageModel("Practice08SetTextSkewXView",R.layout.practice_set_text_skew_x));
        pageModels.add(new PageModel("Practice07SetUnderlineTextView",R.layout.practice_set_underline_text));
        pageModels.add(new PageModel("Practice06SetStrikeThruTextView",R.layout.practice_set_strike_thru_text));
        pageModels.add(new PageModel("Practice05SetFakeBoldTextView",R.layout.practice_set_fake_bold_text));
        pageModels.add(new PageModel("Practice04SetTypefaceView",R.layout.practice_set_typeface));
        pageModels.add(new PageModel("Practice03SetTextSizeView",R.layout.practice_set_text_size));
        pageModels.add(new PageModel("Practice02StaticLayoutView",R.layout.practice_static_layout));
        pageModels.add(new PageModel("Practice01DrawTextView",R.layout.practice_draw_text));
        pageModels.add(new PageModel("Practice16TextPathView",R.layout.view_draw_view_practice16textpathview));
        pageModels.add(new PageModel("Practice15FillPathView",R.layout.view_draw_view_practice15fillpathview));
        pageModels.add(new PageModel("Practice14MaskFilterView",R.layout.view_draw_view_practice14maskfilterview));
        pageModels.add(new PageModel("Practice13ShadowLayerView",R.layout.view_draw_view_practice13shadowlayerview));
        pageModels.add(new PageModel("Practice12PathEffectView",R.layout.view_draw_view_practice12patheffectview));
        pageModels.add(new PageModel("Practice11StrokeMiterView",R.layout.view_draw_view_practice11strokemiterview));
        pageModels.add(new PageModel("Practice10StrokeJoinView",R.layout.view_draw_view_practice10strokejoinview));
        pageModels.add(new PageModel("Practice09StrokeCapView",R.layout.view_draw_view_practice09strokecapview));
        pageModels.add(new PageModel("Practice08XfermodeView",R.layout.view_draw_view_practice08xfermodeview));
        pageModels.add(new PageModel("P07ColorMatrixColorFilterView",R.layout.view_draw_view_p07colormatrixcolorfilterview));
        pageModels.add(new PageModel("P06LightingColorFilterView",R.layout.view_draw_view_p06lightingcolorfilterview));
        pageModels.add(new PageModel("P05ComposeShaderView",R.layout.view_draw_view_p05composeshaderview));
        pageModels.add(new PageModel("P04BitmapShaderView",R.layout.view_draw_view_p04bitmapshaderview));
        pageModels.add(new PageModel("P03SweepGradientView",R.layout.view_draw_p03sweepgradientview));
        pageModels.add(new PageModel("P02RadiaGradientView",R.layout.view_draw_p02radiagradientview));
        pageModels.add(new PageModel("P01LinearGradientView",R.layout.view_draw_view_p01lineargradientview));
        pageModels.add(new PageModel("柱状图",R.layout.view_draw_histogram));
        pageModels.add(new PageModel("PIE",R.layout.view_draw_pie));
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
