package org.upesacm.diversionapp.Activity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import org.upesacm.diversionapp.Adapter.PagerAdapter;
import org.upesacm.diversionapp.R;
import org.upesacm.diversionapp.ViewPagerCustomDuration;
import org.upesacm.diversionapp.ViewPagerFragments.page1;
import org.upesacm.diversionapp.ViewPagerFragments.page2;
import org.upesacm.diversionapp.ViewPagerFragments.page3;
import org.upesacm.diversionapp.ViewPagerFragments.page4;
import org.upesacm.diversionapp.ViewPagerFragments.page5;
import org.upesacm.diversionapp.ViewPagerFragments.page6;
import org.upesacm.diversionapp.ViewPagerFragments.page7;
import org.upesacm.diversionapp.questions.Question1;
import org.upesacm.diversionapp.questions.Question10;
import org.upesacm.diversionapp.questions.Question2;
import org.upesacm.diversionapp.questions.Question3;
import org.upesacm.diversionapp.questions.Question4;
import org.upesacm.diversionapp.questions.Question5;
import org.upesacm.diversionapp.questions.Question61;
import org.upesacm.diversionapp.questions.Question62;
import org.upesacm.diversionapp.questions.Question63;
import org.upesacm.diversionapp.questions.Question71;
import org.upesacm.diversionapp.questions.Question72;
import org.upesacm.diversionapp.questions.Question73;
import org.upesacm.diversionapp.questions.Question81;
import org.upesacm.diversionapp.questions.Question82;
import org.upesacm.diversionapp.questions.Question83;
import org.upesacm.diversionapp.questions.Question91;
import org.upesacm.diversionapp.questions.Question92;
import org.upesacm.diversionapp.questions.Question93;
import org.upesacm.diversionapp.questions.Question94;
import org.upesacm.diversionapp.questions.Question95;
import org.upesacm.diversionapp.questions.Question96;
import org.upesacm.diversionapp.questions.Question97;
import org.upesacm.diversionapp.questions.Question98;
import org.upesacm.diversionapp.questions.Question99;

public class MainActivity extends AppCompatActivity implements page1.Callback, page2.Callback, page3.Callback
        , page4.Callback, page5.Callback, page6.Callback, page7.Callback, Question1.Question1Callback, Question2.Question2Callback,
        Question3.Question3Callback, Question4.Question4Callback, Question5.Question5Callback,
        Question61.Question61Callback, Question62.Question62Callback, Question63.Question63Callback,
        Question71.Question71Callback, Question72.Question72Callback, Question73.Question73Callback,
        Question81.Question81Callback, Question82.Question82Callback, Question83.Question83Callback,
        Question91.Question91Callback, Question92.Question92Callback, Question93.Question93Callback,
        Question99.Question99Callback, Question94.Question94Callback, Question95.Question95Callback,
        Question96.Question96Callback, Question97.Question97Callback, Question98.Question98Callback, Question10.Question10Callback {
    ViewPagerCustomDuration mViewPager;
    ImageView mImageView;
    Button b;
    boolean ques1Done, ques2Done, ques3Done, ques4Done, ques5Done, ques61Done, ques62Done, ques63Done, ques71Done;
    boolean ques72Done, ques73Done, ques81Done, ques82Done, ques83Done, ques91Done, ques92Done, ques93Done, ques94Done;
    boolean ques95Done, ques96Done, ques97Done, ques98Done, ques99Done, ques10Done;
    private boolean back;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = (ViewPagerCustomDuration) findViewById(R.id.viewpager);
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(pagerAdapter);
        mViewPager.setClipToPadding(false);
        mViewPager.setScrollDurationFactor(20);
        mViewPager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        mImageView = findViewById(R.id.me);

    }


    private void moveXY(float targetX, float targetY) {
        AnimatorSet animSetXY = new AnimatorSet();

        ObjectAnimator y = ObjectAnimator.ofFloat(mImageView,
                "translationY", targetY);

        ObjectAnimator x = ObjectAnimator.ofFloat(mImageView,
                "translationX", targetX);

        animSetXY.playTogether(x, y);
        animSetXY.setDuration(1000);
        animSetXY.start();
    }

    void moveX(float x) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(mImageView, "translationX", x);
        animator.setDuration(1000);
        animator.start();
    }

    void moveY(float y) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(mImageView, "translationY", y);
        animator.setDuration(2000);
        animator.start();
    }


    @Override
    public void clickToNextFrom1(Button button) {
        new Question1().show(getSupportFragmentManager(), "text_type");
        b = button;
    }

    @Override
    public void clickToNextFrom2(Button button) {
        if (ques1Done) {
            if (ques2Done) {
                Toast.makeText(this, "You  have  already completed this Question", Toast.LENGTH_SHORT).show();
            } else {
                new Question2().show(getSupportFragmentManager(), "text_type");
                b = button;
            }
        } else {
            Toast.makeText(this, "Complete previous questions first", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void clickToNextFrom3(Button button) {
        if (ques2Done) {
            if (ques3Done) {
                Toast.makeText(this, "You  have  already completed this Question", Toast.LENGTH_SHORT).show();
            } else {
                new Question3().show(getSupportFragmentManager(), "text_type");
                b = button;
            }
        } else {
            Toast.makeText(this, "Complete previous questions first", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void clickToNextFrom4(Button button) {
        if (ques3Done) {
            if (ques4Done) {
                Toast.makeText(this, "You  have  already completed this Question", Toast.LENGTH_SHORT).show();
            } else {
                new Question4().show(getSupportFragmentManager(), "text_type");
                b = button;
            }
        } else {
            Toast.makeText(this, "Complete previous questions first", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void clickToNextFrom5(Button button) {
        if (ques4Done) {
            if (ques5Done) {
                Toast.makeText(this, "You  have  already completed this Question", Toast.LENGTH_SHORT).show();
            } else {
                new Question5().show(getSupportFragmentManager(), "text_type");
                b = button;
            }
        } else {
            Toast.makeText(this, "Complete previous questions first", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void clickToNextFrom61(Button button) {
        if (ques5Done) {
            if (ques61Done) {
                Toast.makeText(this, "You  have  already completed this Question", Toast.LENGTH_SHORT).show();
            } else {
                new Question61().show(getSupportFragmentManager(), "text_type");
                b = button;
            }
        } else {
            Toast.makeText(this, "Complete previous questions first", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void clickToNextFrom62(Button button) {
        if (ques5Done) {
            if (ques62Done) {
                Toast.makeText(this, "You  have  already completed this Question", Toast.LENGTH_SHORT).show();
            } else {
                new Question62().show(getSupportFragmentManager(), "text_type");
                b = button;
            }
        } else {
            Toast.makeText(this, "Complete previous questions first", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void clickToNextFrom63(Button button) {
        if (ques5Done) {
            if (ques63Done) {
                Toast.makeText(this, "You  have  already completed this Question", Toast.LENGTH_SHORT).show();
            } else {
                new Question63().show(getSupportFragmentManager(), "text_type");
                b = button;
            }
        } else {
            Toast.makeText(this, "Complete previous questions first", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void clickToNextFrom71(Button button) {
        if (ques61Done) {
            if (ques71Done) {
                Toast.makeText(this, "You  have  already completed this Question", Toast.LENGTH_SHORT).show();
            } else {
                new Question71().show(getSupportFragmentManager(), "text_type");
                b = button;
            }
        } else {
            Toast.makeText(this, "Complete previous questions first", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void clickToNextFrom72(Button button) {
        if (ques62Done) {
            if (ques72Done) {
                Toast.makeText(this, "You  have  already completed this Question", Toast.LENGTH_SHORT).show();
            } else {
                new Question72().show(getSupportFragmentManager(), "text_type");
                b = button;
            }
        } else {
            Toast.makeText(this, "Complete previous questions first", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void clickToNextFrom73(Button button) {
        if (ques63Done) {
            if (ques73Done) {
                Toast.makeText(this, "You  have  already completed this Question", Toast.LENGTH_SHORT).show();
            } else {
                new Question73().show(getSupportFragmentManager(), "text_type");
                b = button;
            }
        } else {
            Toast.makeText(this, "Complete previous questions first", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void clickToNextFrom81(Button button) {
        if (ques71Done) {
            if (ques81Done) {
                Toast.makeText(this, "You  have  already completed this Question", Toast.LENGTH_SHORT).show();
            } else {
                new Question81().show(getSupportFragmentManager(), "text_type");
                b = button;
            }
        } else {
            Toast.makeText(this, "Complete previous questions first", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void clickToNextFrom82(Button button) {
        if (ques72Done) {
            if (ques82Done) {
                Toast.makeText(this, "You  have  already completed this Question", Toast.LENGTH_SHORT).show();
            } else {
                new Question82().show(getSupportFragmentManager(), "text_type");
                b = button;
            }
        } else {
            Toast.makeText(this, "Complete previous questions first", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void clickToNextFrom83(Button button) {

        if (ques73Done) {
            if (ques83Done) {
                Toast.makeText(this, "You  have  already completed this Question", Toast.LENGTH_SHORT).show();
            } else {
                new Question83().show(getSupportFragmentManager(), "text_type");
                b = button;
            }
        } else {
            Toast.makeText(this, "Complete previous questions first", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void clickToNextFrom91(Button button) {
        if (ques81Done) {
            if (ques91Done) {
                Toast.makeText(this, "You  have  already completed this Question", Toast.LENGTH_SHORT).show();
            } else {
                new Question91().show(getSupportFragmentManager(), "text_type");
                b = button;
            }
        } else {
            Toast.makeText(this, "Complete previous questions first", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void clickToNextFrom92(Button button) {
        if (ques81Done) {
            if (ques92Done) {
                Toast.makeText(this, "You  have  already completed this Question", Toast.LENGTH_SHORT).show();
            } else {
                new Question92().show(getSupportFragmentManager(), "text_type");
                b = button;
            }
        } else {
            Toast.makeText(this, "Complete previous questions first", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void clickToNextFrom93(Button button) {
        if (ques81Done) {
            if (ques93Done) {
                Toast.makeText(this, "You  have  already completed this Question", Toast.LENGTH_SHORT).show();
            } else {
                new Question93().show(getSupportFragmentManager(), "text_type");
                b = button;
            }
        } else {
            Toast.makeText(this, "Complete previous questions first", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void clickToNextFrom94(Button button) {
        if (ques82Done) {
            if (ques94Done) {
                Toast.makeText(this, "You  have  already completed this Question", Toast.LENGTH_SHORT).show();
            } else {
                new Question94().show(getSupportFragmentManager(), "text_type");
                b = button;
            }
        } else {
            Toast.makeText(this, "Complete previous questions first", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void clickToNextFrom95(Button button) {
        if (ques82Done) {
            if (ques95Done) {
                Toast.makeText(this, "You  have  already completed this Question", Toast.LENGTH_SHORT).show();
            } else {
                new Question95().show(getSupportFragmentManager(), "text_type");
                b = button;
            }
        } else {
            Toast.makeText(this, "Complete previous questions first", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void clickToNextFrom96(Button button) {
        if (ques82Done) {
            if (ques96Done) {
                Toast.makeText(this, "You  have  already completed this Question", Toast.LENGTH_SHORT).show();
            } else {
                new Question96().show(getSupportFragmentManager(), "text_type");
                b = button;
            }
        } else {
            Toast.makeText(this, "Complete previous questions first", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void clickToNextFrom97(Button button) {
        if (ques83Done) {
            if (ques97Done) {
                Toast.makeText(this, "You  have  already completed this Question", Toast.LENGTH_SHORT).show();
            } else {
                new Question97().show(getSupportFragmentManager(), "text_type");
                b = button;
            }
        } else {
            Toast.makeText(this, "Complete previous questions first", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void clickToNextFrom98(Button button) {
        if (ques83Done) {
            if (ques98Done) {
                Toast.makeText(this, "You  have  already completed this Question", Toast.LENGTH_SHORT).show();
            } else {
                new Question98().show(getSupportFragmentManager(), "text_type");
                b = button;
            }
        } else {
            Toast.makeText(this, "Complete previous questions first", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void clickToNextFrom99(Button button) {
        if (ques83Done) {
            if (ques99Done) {
                Toast.makeText(this, "You  have  already completed this Question", Toast.LENGTH_SHORT).show();
            } else {
                new Question99().show(getSupportFragmentManager(), "text_type");
                b = button;
            }
        } else {
            Toast.makeText(this, "Complete previous questions first", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void clickToNextFrom10(Button button) {
        if (ques91Done||ques92Done||ques93Done||ques94Done||ques95Done||ques96Done||ques97Done||ques98Done||ques99Done) {
            if (ques10Done) {
                Toast.makeText(this, "You  have  already completed this Question", Toast.LENGTH_SHORT).show();
            } else {
                new Question10().show(getSupportFragmentManager(), "text_type");
                b = button;
            }
        } else {
            Toast.makeText(this, "Complete previous questions first", Toast.LENGTH_SHORT).show();
        }
    }

    private int score = 0;

    @Override
    public void question1(int score) {
        moveY(450f);
        b.setBackgroundResource(R.drawable.selected);
        ques1Done = true;
        this.score = this.score + score;
        Toast.makeText(this, "" + score, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void question2(int score) {
        moveY(1000f);
        moveX(0f);
        mViewPager.setCurrentItem(1);
        b.setBackgroundResource(R.drawable.selected);
        this.score = this.score + score;
        ques2Done = true;
    }

    @Override
    public void question3(int score) {
        moveXY(200f, 400f);
        mViewPager.setCurrentItem(1);
        b.setBackgroundResource(R.drawable.selected);
        this.score = this.score + score;
        ques3Done = true;
    }

    @Override
    public void question4(int score) {
        moveXY(120f, 800f);
        mViewPager.setCurrentItem(2);
        b.setBackgroundResource(R.drawable.selected);
        this.score = this.score + score;
        ques4Done = true;
    }

    @Override
    public void question5(int score) {
        moveXY(300f, 600f);
        b.setBackgroundResource(R.drawable.selected);
        this.score = this.score + score;
        ques5Done = true;
    }

    @Override
    public void question61(int score) {
        moveXY(100f, 400f);
        mViewPager.setCurrentItem(3);
        mViewPager.getChildAt(4).findViewById(R.id.click72).setVisibility(View.GONE);
        mViewPager.getChildAt(4).findViewById(R.id.click73).setVisibility(View.GONE);
        mViewPager.getChildAt(4).findViewById(R.id.click82).setVisibility(View.GONE);
        mViewPager.getChildAt(4).findViewById(R.id.click83).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click94).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click95).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click96).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click97).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click98).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click99).setVisibility(View.GONE);
        b.setBackgroundResource(R.drawable.selected);
        this.score = this.score + score;
        ques61Done = true;
    }

    @Override
    public void question62(int score) {
        moveXY(100f, 600f);
        mViewPager.setCurrentItem(3);
        b.setBackgroundResource(R.drawable.selected);
        mViewPager.getChildAt(4).findViewById(R.id.click71).setVisibility(View.GONE);
        mViewPager.getChildAt(4).findViewById(R.id.click73).setVisibility(View.GONE);
        mViewPager.getChildAt(4).findViewById(R.id.click81).setVisibility(View.GONE);
        mViewPager.getChildAt(4).findViewById(R.id.click83).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click91).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click92).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click93).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click97).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click98).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click99).setVisibility(View.GONE);
        b.setBackgroundResource(R.drawable.selected);
        this.score = this.score + score;
        ques62Done = true;
    }

    @Override
    public void question63(int score) {
        moveXY(100f, 800f);
        mViewPager.setCurrentItem(3);
        b.setBackgroundResource(R.drawable.selected);
        mViewPager.getChildAt(4).findViewById(R.id.click71).setVisibility(View.GONE);
        mViewPager.getChildAt(4).findViewById(R.id.click72).setVisibility(View.GONE);
        mViewPager.getChildAt(4).findViewById(R.id.click81).setVisibility(View.GONE);
        mViewPager.getChildAt(4).findViewById(R.id.click82).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click91).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click92).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click93).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click94).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click95).setVisibility(View.GONE);
        mViewPager.getChildAt(5).findViewById(R.id.click96).setVisibility(View.GONE);
        this.score = this.score + score;
        ques63Done = true;
    }

    @Override
    public void question71(int score) {
        moveY(300f);
        moveX(0f);
        mViewPager.setCurrentItem(4);
        b.setBackgroundResource(R.drawable.selected);
        this.score = this.score + score;
        ques71Done = true;
    }

    @Override
    public void question72(int score) {
        moveX(0f);
        mViewPager.setCurrentItem(4);
        b.setBackgroundResource(R.drawable.selected);
        this.score = this.score + score;
        ques72Done = true;

    }

    @Override
    public void question73(int score) {
        moveY(1000f);
        moveX(0f);
        mViewPager.setCurrentItem(4);
        b.setBackgroundResource(R.drawable.selected);
        this.score = this.score + score;
        ques73Done = true;
    }

    @Override
    public void question81(int score) {
        moveXY(400f, 500f);
        b.setBackgroundResource(R.drawable.selected);
        this.score = this.score + score;
        ques81Done = true;
    }

    @Override
    public void question82(int score) {
        moveX(300f);
        moveY(650f);
        b.setBackgroundResource(R.drawable.selected);
        this.score = this.score + score;
        ques82Done = true;
    }

    @Override
    public void question83(int score) {
        moveXY(400f, 850f);
        b.setBackgroundResource(R.drawable.selected);
        this.score = this.score + score;
        ques83Done = true;
    }

    @Override
    public void question91(int score) {
        moveXY(0f, 30f);
        mViewPager.setCurrentItem(5);
        b.setBackgroundResource(R.drawable.selected);
        this.score = this.score + score;
        ques91Done = true;
    }

    @Override
    public void question92(int score) {
        moveXY(0f, 100f);
        mViewPager.setCurrentItem(5);
        b.setBackgroundResource(R.drawable.selected);
        this.score = this.score + score;
        ques92Done = true;
    }

    @Override
    public void question93(int score) {
        moveXY(0f, 200f);
        mViewPager.setCurrentItem(5);
        b.setBackgroundResource(R.drawable.selected);
        this.score = this.score + score;
        ques93Done = true;
    }

    @Override
    public void question94(int score) {
        moveXY(100f, 500f);
        mViewPager.setCurrentItem(5);
        b.setBackgroundResource(R.drawable.selected);
        this.score = this.score + score;
        ques94Done = true;
    }

    @Override
    public void question95(int score) {
        moveXY(100f, 600f);
        mViewPager.setCurrentItem(5);
        b.setBackgroundResource(R.drawable.selected);
        this.score = this.score + score;
        ques95Done = true;
    }

    @Override
    public void question96(int score) {
        moveXY(100f, 700f);
        mViewPager.setCurrentItem(5);
        b.setBackgroundResource(R.drawable.selected);
        this.score = this.score + score;
        ques96Done = true;
    }

    @Override
    public void question97(int score) {
        moveXY(0f, 900f);
        mViewPager.setCurrentItem(5);
        b.setBackgroundResource(R.drawable.selected);
        this.score = this.score + score;
        ques97Done = true;
    }

    @Override
    public void question98(int score) {
        moveXY(0f, 1000f);
        mViewPager.setCurrentItem(5);
        b.setBackgroundResource(R.drawable.selected);
        this.score = this.score + score;
        ques98Done = true;
    }

    @Override
    public void question99(int score) {
        moveXY(0f, 1100f);
        mViewPager.setCurrentItem(5);
        b.setBackgroundResource(R.drawable.selected);
        this.score = this.score + score;
        ques99Done = true;
    }

    @Override
    public void question10(int score) {
        moveXY(400f, 700f);
        moveX(600f);
        mViewPager.setCurrentItem(6);
        b.setBackgroundResource(R.drawable.selected);
        this.score = this.score + score;
        ques10Done = true;
    }

    @Override
    public void onTreasureClick() {
        if(ques10Done) {
            Toast.makeText(this, "Hurray!!\nComgratulations You Completed the Game...", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "" + score, Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onPause() {
        super.onPause();
        new CountDownTimer(5000, 1000) {

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                if (!back) {
                    finish();
                }
            }
        }.start();
        back = false;
    }

    @Override
    protected void onResume() {
        super.onResume();
        back = true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setMessage("On closing you wont be able to continue the game");
        dialog.setTitle("Finish the game?");
        dialog.setPositiveButton("Finish", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
    }
}
