package com.techdudes.easysharing.view;

import com.techdudes.easysharing.fragment.EditableListFragment;
import com.techdudes.easysharing.widget.EditableListAdapter;

public interface EditableListFragmentModelImpl<V extends EditableListAdapter.EditableViewHolder>
{
    void setLayoutClickListener(EditableListFragment.LayoutClickListener<V> clickListener);
}
