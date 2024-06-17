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
		istore 0
		ldc 60
		istore 1
		iload 0
		iload 1
		imul
		ldc 2
		idiv
		istore 2
		getstatic java/lang/System/out Ljava/io/PrintStream;
		iload 0
		iload 1
		iload 2
		imul
		iadd
		invokevirtual java/io/PrintStream/println(I)V
		return
		.end method
