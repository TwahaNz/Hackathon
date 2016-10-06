package com.ottobots.dataaccess;

import com.sun.org.apache.xalan.internal.utils.FeatureManager;

/**
 * Created by nzetwa01 on 10/6/2016.
 */
public class FeatureDAO
{
    private int upvote;
    private int downvote;

    public Feature getFeature() {

    }

    public static class Builder {

        private int upvote;
        private int downvote;

        public Builder setUpvote(int upvote) {
            this.upvote = upvote;
            return this;
        }

        public Builder setDownvote(int downvote) {
            this.downvote = downvote;
            return this;
        }

        public Feature build() {
            return new Feature(this);
        }
    }
}
