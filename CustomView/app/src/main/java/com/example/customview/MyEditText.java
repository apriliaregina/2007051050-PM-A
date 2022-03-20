package com.example.customview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.core.content.res.ResourcesCompat;

public class MyEditText extends
        androidx.appcompat.widget.AppCompatEditText {
    private Drawable mClearButtonImage;
    public MyEditText(Context context) {
        super(context);
        init();
    }
    public MyEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    public MyEditText(Context context, AttributeSet attrs, int
            defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setHint("Masukkan NPM dan Nama");
        setTextAlignment(TEXT_ALIGNMENT_VIEW_START);
    }
    private void init() {
        mClearButtonImage = ResourcesCompat.getDrawable(getResources(),
                R.drawable.ic_close_black_24dp, null);
        setOnTouchListener(new OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if ((getCompoundDrawablesRelative()[2] != null)) {
                    float clearButtonStart;
                    float clearButtonEnd;
                    boolean isClearButtonClicked = false;
                    if (getLayoutDirection() == LAYOUT_DIRECTION_RTL) {
                        clearButtonEnd =
                                mClearButtonImage.getIntrinsicWidth() + getPaddingStart();
                        if (event.getX() < clearButtonEnd) {
                            isClearButtonClicked = true;
                        }
                    } else {
                        clearButtonStart = (getWidth() - getPaddingEnd() -
                                mClearButtonImage.getIntrinsicWidth());
                        if (event.getX() > clearButtonStart) {
                            isClearButtonClicked = true;
                        }
                    }
                    if (isClearButtonClicked) {
                        if (event.getAction() == MotionEvent.ACTION_DOWN) {
                            mClearButtonImage =
                                    ResourcesCompat.getDrawable(getResources(),
                                            R.drawable.ic_close_black_24dp, null);
                            showClearButton();
                            return true;
                        } else if (event.getAction() ==
                                MotionEvent.ACTION_UP) {
                            mClearButtonImage =
                                    ResourcesCompat.getDrawable(getResources(),
                                            R.drawable.ic_close_black_24dp, null);
                            if (getText() != null) {
                                getText().clear();
                            }
                            hideClearButton();
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
                return false;
            }
        });
        addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int
                    count, int after) {
                // Do nothing.
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int
                    before, int count) {
                if (!s.toString().isEmpty()) {
                    showClearButton();
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
                // Do nothing.
            }
        });
    }
    private void showClearButton() {
        // Sets the Drawables (if any) to appear to the left of,
        // above, to the right of, and below the text.
        setCompoundDrawablesRelativeWithIntrinsicBounds
                (null, // Start of text.
                        null, // Top of text.
                        mClearButtonImage, // End of text.
                        null); // Below text.
    }
    private void hideClearButton() {
        setCompoundDrawablesRelativeWithIntrinsicBounds
                (null, // Start of text.
                        null, // Top of text.
                        null, // End of text.
                        null); // Below text.
    }
}

