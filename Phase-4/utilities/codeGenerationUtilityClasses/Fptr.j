.class public Fptr
.super java/lang/Object

.field instance Ljava/lang/Object;
.field methodName Ljava/lang/String;

.method public <init>(Ljava/lang/Object;Ljava/lang/String;)V
  .limit stack 32
  .limit locals 32
  .var 0 is this LFptr; from Label0 to Label14
  .var 1 is instance Ljava/lang/Object; from Label0 to Label14
  .var 2 is methodName Ljava/lang/String; from Label0 to Label14
Label0:
  .line 9
  0: aload_0
  1: invokespecial java/lang/Object/<init>()V
  .line 10
  4: aload_0
  5: aload_1
  6: putfield Fptr/instance Ljava/lang/Object;
  .line 11
  9: aload_0
  10: aload_2
  11: putfield Fptr/methodName Ljava/lang/String;
Label14:
  .line 12
  14: return
.end method

.method public invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
  .limit stack 32
  .limit locals 32
  .var 0 is this LFptr; from Label0 to Label109
  .var 1 is arguments Ljava/util/ArrayList; signature "Ljava/util/ArrayList<Ljava/lang/Object;>;" from Label0 to Label109
  .var 2 is argumentsSize I from Label5 to Label109
  .var 3 is argsClasses [Ljava/lang/Class; from Label10 to Label109
  .var 4 is argsArray [Ljava/lang/Object; from Label16 to Label109
  .var 5 is i I from Label19 to Label55
  .var 5 is objectMethod Ljava/lang/reflect/Method; from Label58 to Label109
  .var 6 is e Ljava/lang/NoSuchMethodException; from Label80 to Label85
  .var 6 is e Ljava/lang/ReflectiveOperationException; from Label99 to Label108
Label0:
  .line 15
  0: aload_1
  1: invokevirtual java/util/ArrayList/size()I
  4: istore_2
Label5:
  .line 16
  5: iload_2
  6: anewarray java/lang/Class
  9: astore_3
Label10:
  .line 17
  10: iload_2
  11: anewarray java/lang/Object
  14: astore 4
Label16:
  .line 18
  16: iconst_0
  17: istore 5
Label19:
  19: iload 5
  21: iload_2
  22: if_icmpge Label55
  .line 19
  25: aload_3
  26: iload 5
  28: aload_1
  29: iload 5
  31: invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;
  34: invokevirtual java/lang/Object/getClass()Ljava/lang/Class;
  37: aastore
  .line 20
  38: aload 4
  40: iload 5
  42: aload_1
  43: iload 5
  45: invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;
  48: aastore
  .line 18
  49: iinc 5 1
  52: goto Label19
Label55:
  .line 22
  55: aconst_null
  56: astore 5
Label58:
  .line 24
  58: aload_0
  59: getfield Fptr/instance Ljava/lang/Object;
  62: invokevirtual java/lang/Object/getClass()Ljava/lang/Class;
  65: aload_0
  66: getfield Fptr/methodName Ljava/lang/String;
  69: aload_3
  70: invokevirtual java/lang/Class/getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
  73: astore 5
Label75:
  .line 27
  75: goto Label85
Label78:
  .line 25
  78: astore 6
Label80:
  .line 26
  80: aload 6
  82: invokevirtual java/lang/NoSuchMethodException/printStackTrace()V
Label85:
  .line 29
  85: aload 5
  87: aload_0
  88: getfield Fptr/instance Ljava/lang/Object;
  91: aload 4
  93: invokevirtual java/lang/reflect/Method/invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
Label96:
  96: areturn
Label97:
  .line 30
  97: astore 6
Label99:
  .line 31
  99: aload 6
  101: invokevirtual java/lang/ReflectiveOperationException/printStackTrace()V
  .line 32
  104: iconst_1
  105: invokestatic java/lang/System/exit(I)V
Label108:
  .line 34
  108: aconst_null
Label109:
  109: areturn
.end method

