USE [dbSoru]
GO
/****** Object:  Table [dbo].[tblSoru]    Script Date: 06/17/2014 06:48:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblSoru](
	[SoruNo] [int] IDENTITY(1,1) NOT NULL,
	[A] [nvarchar](15) NOT NULL,
	[B] [nvarchar](15) NOT NULL,
	[C] [nvarchar](15) NOT NULL,
	[D] [nvarchar](15) NOT NULL,
	[E] [nvarchar](15) NOT NULL,
	[TRUE] [nvarchar](15) NOT NULL,
 CONSTRAINT [PK_tblSoru] PRIMARY KEY CLUSTERED 
(
	[SoruNo] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblSkor]    Script Date: 06/17/2014 06:48:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblSkor](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Ad] [nvarchar](20) NOT NULL,
	[Soyad] [nvarchar](20) NULL,
	[Puan] [int] NOT NULL,
	[Tarih] [date] NULL,
 CONSTRAINT [PK_tblPuan] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
