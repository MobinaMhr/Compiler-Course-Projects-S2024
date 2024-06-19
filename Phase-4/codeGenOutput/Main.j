.class public Main
		.super java/lang/Object
.method public static main([Ljava/lang/String;)V
		.limit stack 128
		.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
		.end method
.method public foo(Ljava/util/ArrayList;)V
		.limit stack 128
		.limit locals 128
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 2
		Label_0:
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		aload 1
		invokevirtual java/util/ArrayList/size()I
		if_icmpge Label_2
		ldc 0
		goto Label_3
		Label_2:
		ldc 1
		Label_3:
		ifeq Label_5
		Label_4:
		goto Label_1
		goto Label_6
		Label_5:
		Label_6:
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 3
		Label_7:
		aload 3
		invokevirtual java/lang/Integer/intValue()I
		aload 1
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		if_icmpge Label_9
		ldc 0
		goto Label_10
		Label_9:
		ldc 1
		Label_10:
		ifeq Label_12
		Label_11:
		goto Label_8
		goto Label_13
		Label_12:
		Label_13:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 1
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		ldc 1
		aload 3
		invokevirtual java/lang/Integer/intValue()I
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 3
		goto Label_7
		Label_8:
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 2
		goto Label_0
		Label_1:
		return
		.end method
.method public <init>()V
		.limit stack 128
		.limit locals 128
		aload_0
		invokespecial java/lang/Object/<init>()V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 2
		aload 2
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 2
		ldc 3
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 2
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 2
		ldc 4
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 2
		astore 1
		aload 0
		aload 1
		invokevirtual Main/foo(Ljava/util/ArrayList;)V
		return
		.end method
