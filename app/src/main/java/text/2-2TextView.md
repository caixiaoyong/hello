** 文字大小、颜色
    android:textColor="#000add"
    android:textSize="20sp"

** 显示不下使用'...'
   android:ellipsize="end"
   android:maxLines="2"

** 文字 + icon
   android:drawableRight="@drawable/icon_connection1"

** 中划线、下划线
   TextViewActivity.java：

                mTv4= findViewById(R.id.tv_4);
                        mTv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//中划线
                        mTv4.getPaint().setAntiAlias(true);//去除锯齿

                        mTv5=findViewById(R.id.tv_5);
                        mTv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);//下划线

                        mTv6=findViewById(R.id.tv_6);
                        mTv6.setText(Html.fromHtml("<u>下划线第二种方法</u>"));//下划线2

** 跑马灯
    android:singleLine="true"
            android:ellipsize="marquee"
            android:marqueeRepeatLimit="marquee_forever"
            android:focusable="true"
            android:focusableInTouchMode="true"

        <!--android:singleLine="true" 设置属性为单行显示
         android:ellipsize=”marquee”–以横向文字滚动方式显示(需获得当前焦点时)

         android:ellipsize = "end"在尾部显示
         android:ellipsize = "start"在是前面显示
         android:ellipsize = "middle" 省略号在中间
         android:ellipsize = "marquee" 跑马灯

         focusable表示 移动光标时 是否能聚焦到组件上
         focusableInTouchMode可以通过触摸获取焦点-->