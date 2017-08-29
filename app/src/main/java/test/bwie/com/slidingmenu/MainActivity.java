package test.bwie.com.slidingmenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

//添加布局
@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    //简化代码量 影响性能 通过类注释的形式 注解

    /**
     * 找控件注释
     */
    @ViewInject(R.id.tv_name)
    Button aa; //不能写私有

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        x.view().inject(this);//添加布局 需要写这个***

        SlidingMenu menu = new SlidingMenu(this);
        menu.setMode(SlidingMenu.LEFT);

        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN); //**
        menu.setShadowWidthRes(R.dimen.shadow_width);
        //menu.setShadowDrawable(R.mipmap.ic_launcher_round);
        // 设置滑动菜单视图的宽度
        menu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        // 设置渐入渐出效果的值
        menu.setFadeDegree(0.35f);
        menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
        //为侧滑菜单设置布局
        menu.setMenu(R.layout.leftmenu);
        
    }

    /**
     * 点击事件 默认的 可以简化不写
     * @param v
     */
  //@Event(R.id.tv_name)
    @Event(type= View.OnClickListener.class,value=R.id.tv_name)
    private void testInjectOnclick(View v){

        Toast.makeText(this,"点击事件",Toast.LENGTH_SHORT).show();
    }
    /**
     * 长按事件
     */
//    @Event(type = View.OnLongClickListener.class,value = R.id.tv_name)
//    private boolean testOnLongClickListener(View v){
//        return true;
//    }


    //RequestParams params=new RequestParams(url);


}
