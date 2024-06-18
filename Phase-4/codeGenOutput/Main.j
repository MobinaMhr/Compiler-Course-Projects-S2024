.class public Main
		.super java/lang/Object
.method public static main([Ljava/lang/String;)V
		.limit stack 128
		.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
		.end method
.method public <init>()V
		.limit stack 128
		.limit locals 128
		aload_0
		invokespecial java/lang/Object/<init>()V
		ldc 50
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 1
		ldc 60
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 2
		getstatic java/lang/System/out Ljava/io/PrintStream;
		iload 2
		invokevirtual java/io/PrintStream/println(I)V
		return
		.end method
