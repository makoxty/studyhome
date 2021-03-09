package com.example.demo.study5;

public class FooBusinessLogic {

	public void execute() {

        if (isAnyCondition()) {
            doSomething();
        } else {
            doOtherthing();
        }
    }

    protected boolean isAnyCondition() {
		return false;
        // DBに接続しに行く複雑な処理
    }

    protected void doSomething() {
        // やはりDBに接続しに行く複雑な処理
    }

    protected void doOtherthing() {
        // こいつもDBに接続しに行く複雑な処理
    }

}
