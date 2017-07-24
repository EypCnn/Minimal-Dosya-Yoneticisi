package app.android.com.oteyp.dosya;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * EypCnn
 */
public class VerticalSpaceRecycler extends RecyclerView.ItemDecoration {
    private final int mVerticalSpaceHeight;

    public VerticalSpaceRecycler(int mVerticalSpaceHeight) {
        this.mVerticalSpaceHeight = mVerticalSpaceHeight;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent,
                               RecyclerView.State state) {
        outRect.bottom = mVerticalSpaceHeight;
    }
}

