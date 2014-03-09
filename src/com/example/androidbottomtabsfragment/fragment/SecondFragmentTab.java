/*
 * Copyright© 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.example.androidbottomtabsfragment.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androidbottomtabsfragment.R;
import com.example.androidbottomtabsfragment.base.BaseFragment;

/**
 * @author Ami Mar 9, 2014
 */
public class SecondFragmentTab extends BaseFragment {
	public TextView textView;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.androidbottomtabsfragment.base.BaseFragment#onCreate(android
	 * .os.Bundle)
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * android.support.v4.app.Fragment#onCreateView(android.view.LayoutInflater,
	 * android.view.ViewGroup, android.os.Bundle)
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v = inflater.inflate(R.layout.textview_layout, null);
		textView = (TextView) v.findViewById(R.id.textView1);
		textView.setText(getResources().getString(R.string.second_tab));
		return v;
	}
}
