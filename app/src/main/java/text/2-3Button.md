**文字大小、颜色
  android:textSize="22sp"
  android:textColor="#2B4DD5"

**自定义背景形状
  android:background="@drawable/bg_btn3"

**自定义按压效果
  android:background="@drawable/bg_btn4"

  res/drawable/bg_btn4:
             <item android:state_pressed="false">
                       <shape>
                           <solid android:color="#22DDDD"/>
                           <corners android:radius="5dp"/>
                       </shape>
                   </item>

             <item android:state_pressed="true">
                       <shape>
                           <solid android:color="#148585"/>
                           <corners android:radius="5dp"/>
                       </shape>
                   </item>

**点击事件
  activity_button.xml:
       android:onClick="showToast"    <!--showToast提示信息的UI-->

  ButtonActivity.java:
        public void showToast(View view){
              Toast.makeText(this,"btn4被点击了，弹出的消息模式",Toast.LENGTH_SHORT).show();
           }