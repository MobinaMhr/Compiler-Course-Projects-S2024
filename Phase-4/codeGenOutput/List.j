.class public List
.super java/lang/Object

.field public elements Ljava/util/ArrayList;

.method public <init>(Ljava/util/ArrayList;)V
  .limit stack 32
  .limit locals 32
  .var 0 is this LList; from Label0 to Label52
  .var 1 is newElements Ljava/util/ArrayList; signature "Ljava/util/ArrayList<Ljava/lang/Object;>;" from Label0 to Label52
  .var 3 is newElement Ljava/lang/Object; from Label36 to Label49
Label0:
  .line 7
  0: aload_0
  1: invokespecial java/lang/Object/<init>()V
  .line 8
  4: aload_0
  5: new java/util/ArrayList
  8: dup
  9: invokespecial java/util/ArrayList/<init>()V
  12: putfield List/elements Ljava/util/ArrayList;
  .line 9
  15: aload_1
  16: invokevirtual java/util/ArrayList/iterator()Ljava/util/Iterator;
  19: astore_2
Label20:
  20: aload_2
  21: invokeinterface java/util/Iterator/hasNext()Z 1
  26: ifeq Label52
  29: aload_2
  30: invokeinterface java/util/Iterator/next()Ljava/lang/Object; 1
  35: astore_3
Label36:
  .line 10
  36: aload_0
  37: getfield List/elements Ljava/util/ArrayList;
  40: aload_0
  41: aload_3
  42: invokevirtual List/getNewObject(Ljava/lang/Object;)Ljava/lang/Object;
  45: invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
  48: pop
Label49:
  49: goto Label20
Label52:
  .line 11
  52: return
.end method

.method public <init>(LList;)V
  .limit stack 32
  .limit locals 32
  .var 0 is this LList; from Label0 to Label8
  .var 1 is that LList; from Label0 to Label8
Label0:
  .line 14
  0: aload_0
  1: aload_1
  2: getfield List/elements Ljava/util/ArrayList;
  5: invokespecial List/<init>(Ljava/util/ArrayList;)V
Label8:
  .line 15
  8: return
.end method

.method private getNewObject(Ljava/lang/Object;)Ljava/lang/Object;
  .limit stack 33
  .limit locals 32
  .var 0 is this LList; from Label0 to Label20
  .var 1 is o Ljava/lang/Object; from Label0 to Label20
Label0:
  .line 18
  0: aload_1
  1: instanceof List
  4: ifeq Label19
  .line 19
  7: new List
  10: dup
  11: aload_1
  12: checkcast List
  15: invokespecial List/<init>(LList;)V
  18: areturn
Label19:
  .line 21
  19: aload_1
Label20:
  20: areturn
.end method

.method public getElement(I)Ljava/lang/Object;
  .limit stack 32
  .limit locals 32
  .var 0 is this LList; from Label0 to Label8
  .var 1 is index I from Label0 to Label8
Label0:
  .line 25
  0: aload_0
  1: getfield List/elements Ljava/util/ArrayList;
  4: iload_1
  5: invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;
Label8:
  8: areturn
.end method

.method public setElement(ILjava/lang/Object;)V
  .limit stack 32
  .limit locals 32
  .var 0 is this LList; from Label0 to Label14
  .var 1 is index I from Label0 to Label14
  .var 2 is o Ljava/lang/Object; from Label0 to Label14
Label0:
  .line 29
  0: aload_0
  1: getfield List/elements Ljava/util/ArrayList;
  4: iload_1
  5: aload_0
  6: aload_2
  7: invokevirtual List/getNewObject(Ljava/lang/Object;)Ljava/lang/Object;
  10: invokevirtual java/util/ArrayList/set(ILjava/lang/Object;)Ljava/lang/Object;
  13: pop
Label14:
  .line 30
  14: return
.end method

